package pokemonbdsp;

import java.util.ArrayList;
import java.util.List;

public class PokemonFactory {

    // itemName can be null for no held item.
    public static Pokemon create(String speciesName, int level, Nature nature,
                                 String itemName, String... moveNames) {
        Species species = SpeciesData.get(speciesName);
        HeldItem item = (itemName == null) ? null : ItemData.get(itemName);
        List<Move> moves = new ArrayList<>();
        for (String moveName : moveNames) {
            moves.add(MoveData.get(moveName));
        }
        return new Pokemon(species, level, nature, item, moves);
    }
}