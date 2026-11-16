package pokemonbdsp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Species loaded: " + SpeciesData.all().size());   // should be 51
        System.out.println("Moves loaded: " + MoveData.all().size());
        System.out.println("Items loaded: " + ItemData.all().size());
        System.out.println();

        for (EliteFourMember t : TrainerData.eliteFourAndChampion()) {
            System.out.println(t.getTitle() + " " + t.getName());
            for (Pokemon p : t.getTeam()) {
                System.out.println("  " + p + " | " + p.getSpecies()
                        + " | " + p.getNature() + " | " + p.getHeldItem()
                        + " | " + p.getMoves());
            }
        }
    }
}