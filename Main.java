package pokemonbdsp;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Species loaded: " + SpeciesData.all().size());   // should be 51
        System.out.println("Moves loaded: " + MoveData.all().size());
        System.out.println("Items loaded: " + ItemData.all().size());
        System.out.println();



       */
        BattleManager.displayPokemon();
        BattleManager.displayItems();
        BattleManager.displayMoves();
        BattleManager.displayEliteFourAndChamp();
    }
}