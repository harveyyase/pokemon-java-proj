package pokemonbdsp;

import java.util.LinkedHashMap;
import java.util.Map;

public class SpeciesData {
    private static final Map<String, Species> DEX = new LinkedHashMap<>();

    static {
        // add(name, type1, type2, HP, Atk, Def, SpA, SpD, Spe)

        // ===== Your 37 playable Pokemon =====
        add("Torterra", Type.GRASS, Type.GROUND, 95, 109, 105, 75, 85, 56);
        add("Infernape", Type.FIRE, Type.FIGHTING, 76, 104, 71, 104, 71, 108);
        add("Empoleon", Type.WATER, Type.STEEL, 84, 86, 88, 111, 101, 60);
        add("Staraptor", Type.NORMAL, Type.FLYING, 85, 120, 70, 50, 60, 100);
        add("Bibarel", Type.NORMAL, Type.WATER, 79, 85, 60, 55, 60, 71);
        add("Kricketune", Type.BUG, null, 77, 85, 51, 55, 51, 65);
        add("Luxray", Type.ELECTRIC, null, 80, 120, 79, 95, 79, 70);
        add("Alakazam", Type.PSYCHIC, null, 55, 50, 45, 135, 95, 120);
        add("Gyarados", Type.WATER, Type.FLYING, 95, 125, 79, 60, 100, 81);
        add("Roserade", Type.GRASS, Type.POISON, 60, 70, 65, 125, 105, 90);
        add("Crobat", Type.POISON, Type.FLYING, 85, 90, 80, 70, 80, 130);
        add("Golem", Type.ROCK, Type.GROUND, 80, 120, 130, 55, 65, 45);
        add("Steelix", Type.STEEL, Type.GROUND, 75, 85, 200, 55, 65, 30);
        add("Machamp", Type.FIGHTING, null, 90, 130, 80, 65, 85, 55);
        add("Bastiodon", Type.ROCK, Type.STEEL, 60, 52, 168, 47, 138, 30);
        add("Rampardos", Type.ROCK, null, 97, 165, 60, 65, 50, 58);
        add("Vespiquen", Type.BUG, Type.FLYING, 70, 80, 102, 80, 102, 40);
        add("Floatzel", Type.WATER, null, 85, 105, 55, 85, 50, 115);
        add("Heracross", Type.BUG, Type.FIGHTING, 80, 125, 75, 40, 95, 85);
        add("Gengar", Type.GHOST, Type.POISON, 60, 65, 60, 130, 75, 110);
        add("Honchkrow", Type.DARK, Type.FLYING, 100, 125, 52, 105, 52, 71);
        add("Mismagius", Type.GHOST, null, 60, 60, 60, 105, 105, 105);
        add("Whiscash", Type.WATER, Type.GROUND, 110, 78, 73, 76, 71, 60);
        add("Mr. Mime", Type.PSYCHIC, Type.FAIRY, 40, 45, 65, 100, 120, 90);
        add("Blissey", Type.NORMAL, null, 255, 10, 10, 75, 135, 55);
        add("Clefable", Type.FAIRY, null, 95, 70, 73, 95, 90, 60);
        add("Pikachu", Type.ELECTRIC, null, 35, 55, 40, 50, 50, 90);
        add("Raichu", Type.ELECTRIC, null, 60, 90, 55, 90, 80, 110);
        add("Snorlax", Type.NORMAL, null, 160, 110, 65, 65, 110, 30);
        add("Garchomp", Type.DRAGON, Type.GROUND, 108, 130, 95, 80, 85, 102);
        add("Lucario", Type.FIGHTING, Type.STEEL, 70, 110, 70, 115, 70, 90);
        add("Azumarill", Type.WATER, Type.FAIRY, 100, 50, 80, 60, 80, 50);
        add("Milotic", Type.WATER, null, 95, 60, 79, 100, 125, 81);
        add("Toxicroak", Type.POISON, Type.FIGHTING, 83, 106, 65, 86, 65, 85);
        add("Abomasnow", Type.GRASS, Type.ICE, 90, 92, 75, 92, 85, 60);
        add("Dialga", Type.STEEL, Type.DRAGON, 100, 120, 120, 150, 100, 90);
        add("Palkia", Type.WATER, Type.DRAGON, 90, 120, 100, 150, 120, 100);

        // ===== 14 extra Pokemon for trainer teams =====
        add("Dustox", Type.BUG, Type.POISON, 60, 50, 70, 50, 90, 65);
        add("Beautifly", Type.BUG, Type.FLYING, 60, 70, 50, 100, 50, 65);
        add("Drapion", Type.POISON, Type.DARK, 70, 90, 110, 60, 75, 95);
        add("Quagsire", Type.WATER, Type.GROUND, 95, 85, 85, 65, 65, 35);
        add("Sudowoodo", Type.ROCK, null, 70, 100, 115, 30, 65, 30);
        add("Hippowdon", Type.GROUND, null, 108, 112, 118, 68, 72, 47);
        add("Rapidash", Type.FIRE, null, 65, 100, 70, 80, 80, 105);
        add("Drifblim", Type.GHOST, Type.FLYING, 150, 80, 44, 90, 54, 80);
        add("Lopunny", Type.NORMAL, null, 65, 76, 84, 54, 96, 105);
        add("Girafarig", Type.NORMAL, Type.PSYCHIC, 70, 80, 65, 90, 65, 85);
        add("Medicham", Type.FIGHTING, Type.PSYCHIC, 60, 60, 75, 60, 75, 80);
        add("Bronzong", Type.STEEL, Type.PSYCHIC, 67, 89, 116, 79, 116, 33);
        add("Spiritomb", Type.GHOST, Type.DARK, 50, 92, 108, 92, 108, 35);
        add("Gastrodon", Type.WATER, Type.GROUND, 111, 83, 68, 92, 82, 39);
    }

    private static void add(String name, Type t1, Type t2,
                            int hp, int atk, int def, int spa, int spd, int spe) {
        DEX.put(name, new Species(name, t1, t2, hp, atk, def, spa, spd, spe));
    }

    public static Species get(String name) {
        Species s = DEX.get(name);
        if (s == null) {
            throw new IllegalArgumentException("Unknown species: " + name);
        }
        return s;
    }

    public static Map<String, Species> all() {
        return DEX;
    }
}