package pokemonbdsp;

import java.util.ArrayList;
import java.util.List;

public class GameDisplay {

    public void displayPokemon() {
        List<Species> pokemonList = new ArrayList<>(SpeciesData.allById().values());

        System.out.println("-----Pokemon List -----");
        System.out.println("=".repeat(200));
        for (int i = 0; i < pokemonList.size(); i += 2) {
            Species speciesL = pokemonList.get(i);

            System.out.printf("%-25s", "[#" + speciesL.getId() + "] " + speciesL.getName());

            if (i + 1 < pokemonList.size()) {
                Species speciesR = pokemonList.get(i + 1);
                // Print the right column
                System.out.printf("%-25s", "[#" + speciesR.getId() + "] " + speciesR.getName());
            }
            System.out.println();
        }
        System.out.println("=".repeat(200));
    }
    public void displayMoves(){
        List<Move> moveList = new ArrayList<>(MoveData.allById().values());

        System.out.println("-----Move List -----");
        System.out.println("=".repeat(200));
        for(int i = 0; i < moveList.size(); i+=3) {
            Move moveL = moveList.get(i);

            System.out.printf("%-75s", "[#" + moveL.getId() + "] " + moveL);


            if (i + 1 < moveList.size()) {
                Move moveM = moveList.get(i + 1);
                // Print the middle column
                System.out.printf("%-75s", "[#" + moveM.getId() + "]" + moveM);
            }

            if (i + 2 < moveList.size()) {
                Move moveR = moveList.get(i + 2);
                // Print the right column
                System.out.printf("%-75s", "[#" + moveR.getId() + "] " + moveR);
            }

            System.out.println();
        }
        System.out.println("=".repeat(200));
    }
    public void displayItems() {
        List<HeldItem> itemList = new ArrayList<>(ItemData.allById().values());

        System.out.println("-----Item List -----");
        System.out.println("=".repeat(200));
        for (HeldItem item : itemList) {
            System.out.printf("%-25s", "[#" + item.getId() + "] " + "[" + item + "]");
            System.out.println();

        }
        System.out.println("=".repeat(200));
    }

    public void displayEliteFourAndChamp() {
        System.out.println("Trainers to beat:");
        System.out.println("=".repeat(110));

        for (EliteFourMember t : TrainerData.eliteFourAndChampion()) {

            System.out.println("\n=== " + t.getTitle() + " " + t.getName() + " ===");
            List<Pokemon> team = t.getTeam();

            // Loop through the team 3 Pokémon at a time (i += 3)
            for (int i = 0; i < team.size(); i += 3) {


                for (int j = 0; j < 3; j++) {
                    if (i + j < team.size()) {
                        Pokemon p = team.get(i + j);
                        String item = (p.getHeldItem() == null) ? "" : " @ " + p.getHeldItem().getName();
                        System.out.printf("%-35s", p.getSpecies().getName() + item);
                    } else {
                        System.out.printf("%-35s", ""); // Empty space if no Pokémon here
                    }
                }
                System.out.println();


                for (int j = 0; j < 3; j++) {
                    if (i + j < team.size()) {
                        System.out.printf("%-35s", "Level: " + team.get(i + j).getLevel());
                    } else {
                        System.out.printf("%-35s", "");
                    }
                }
                System.out.println();


                for (int j = 0; j < 3; j++) {
                    if (i + j < team.size()) {
                        System.out.printf("%-35s", team.get(i + j).getNature() + " Nature");
                    } else {
                        System.out.printf("%-35s", "");
                    }
                }
                System.out.println();


                for (int j = 0; j < 3; j++) {
                    if (i + j < team.size()) {
                        Pokemon p = team.get(i + j);
                        String types = (p.getSpecies().getType2() == null)
                                ? p.getSpecies().getType1().toString()
                                : p.getSpecies().getType1() + "/" + p.getSpecies().getType2();
                        System.out.printf("%-35s", "Type: " + types);
                    } else {
                        System.out.printf("%-35s", "");
                    }
                }
                System.out.println();
                for (int moveIndex = 0; moveIndex < 4; moveIndex++) {
                    for (int j = 0; j < 3; j++) {
                        if (i + j < team.size()) {
                            Pokemon p = team.get(i + j);

                            if (moveIndex < p.getMoves().size()) {
                                System.out.printf("%-35s", "- " + p.getMoves().get(moveIndex).getName());
                            } else {
                                System.out.printf("%-35s", "");
                            }
                        } else {
                            System.out.printf("%-35s", "");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        System.out.println("=".repeat(110));
    }

    public void chooseMode() {
        System.out.println("---Pick A Gamemode---");
        System.out.println("[1] Normal");
        System.out.println("[2] Randomizer");
    }

    public void choosePokemon() {
        displayPokemon();
    }

    public void chooseHeldItem() {
        displayItems();
    }

    public void chooseMove() {
        displayMoves();
    }

    public void pickMove(Pokemon p) {
        //List<Move> move = new ArrayList<>(p.getMoves());
        int i = 1;
        for(Move move : p.getMoves()) {
            System.out.println("[" + i + "] " + p + " PWR :  " + move.getPower() + " ACC :  " +
                            move.getAccuracy() + " PP :  " + move.getPp());
            i++;
        }

    }

    public void pickBattleChoice() {
        System.out.println("What's your next move?");
        System.out.println("[1] Pokemon");
        System.out.println("[2] Fight");
        System.out.println("[3] Forfeit");
        System.out.println("[4] Bag");
    }

}
