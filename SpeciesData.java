package pokemonbdsp;

import java.util.LinkedHashMap;
import java.util.Map;

public class SpeciesData {
    private static final Map<String, Species> DEX = new LinkedHashMap<>();
    private static final Map<Integer, Species> BY_ID = new LinkedHashMap<>();

    static {
        // add(id, name, type1, type2, HP, Atk, Def, SpA, SpD, Spe)

        // ===== Your 37 playable Pokemon =====
        add(389, "Torterra", Type.GRASS, Type.GROUND, 95, 109, 105, 75, 85, 56);
        add(392, "Infernape", Type.FIRE, Type.FIGHTING, 76, 104, 71, 104, 71, 108);
        add(395, "Empoleon", Type.WATER, Type.STEEL, 84, 86, 88, 111, 101, 60);
        add(398, "Staraptor", Type.NORMAL, Type.FLYING, 85, 120, 70, 50, 60, 100);
        add(400, "Bibarel", Type.NORMAL, Type.WATER, 79, 85, 60, 55, 60, 71);
        add(402, "Kricketune", Type.BUG, null, 77, 85, 51, 55, 51, 65);
        add(405, "Luxray", Type.ELECTRIC, null, 80, 120, 79, 95, 79, 70);
        add(65,  "Alakazam", Type.PSYCHIC, null, 55, 50, 45, 135, 95, 120);
        add(130, "Gyarados", Type.WATER, Type.FLYING, 95, 125, 79, 60, 100, 81);
        add(407, "Roserade", Type.GRASS, Type.POISON, 60, 70, 65, 125, 105, 90);
        add(169, "Crobat", Type.POISON, Type.FLYING, 85, 90, 80, 70, 80, 130);
        add(76,  "Golem", Type.ROCK, Type.GROUND, 80, 120, 130, 55, 65, 45);
        add(208, "Steelix", Type.STEEL, Type.GROUND, 75, 85, 200, 55, 65, 30);
        add(68,  "Machamp", Type.FIGHTING, null, 90, 130, 80, 65, 85, 55);
        add(411, "Bastiodon", Type.ROCK, Type.STEEL, 60, 52, 168, 47, 138, 30);
        add(409, "Rampardos", Type.ROCK, null, 97, 165, 60, 65, 50, 58);
        add(416, "Vespiquen", Type.BUG, Type.FLYING, 70, 80, 102, 80, 102, 40);
        add(419, "Floatzel", Type.WATER, null, 85, 105, 55, 85, 50, 115);
        add(214, "Heracross", Type.BUG, Type.FIGHTING, 80, 125, 75, 40, 95, 85);
        add(94,  "Gengar", Type.GHOST, Type.POISON, 60, 65, 60, 130, 75, 110);
        add(430, "Honchkrow", Type.DARK, Type.FLYING, 100, 125, 52, 105, 52, 71);
        add(429, "Mismagius", Type.GHOST, null, 60, 60, 60, 105, 105, 105);
        add(340, "Whiscash", Type.WATER, Type.GROUND, 110, 78, 73, 76, 71, 60);
        add(122, "Mr. Mime", Type.PSYCHIC, Type.FAIRY, 40, 45, 65, 100, 120, 90);
        add(242, "Blissey", Type.NORMAL, null, 255, 10, 10, 75, 135, 55);
        add(36,  "Clefable", Type.FAIRY, null, 95, 70, 73, 95, 90, 60);
        add(25,  "Pikachu", Type.ELECTRIC, null, 35, 55, 40, 50, 50, 90);
        add(26,  "Raichu", Type.ELECTRIC, null, 60, 90, 55, 90, 80, 110);
        add(143, "Snorlax", Type.NORMAL, null, 160, 110, 65, 65, 110, 30);
        add(445, "Garchomp", Type.DRAGON, Type.GROUND, 108, 130, 95, 80, 85, 102);
        add(448, "Lucario", Type.FIGHTING, Type.STEEL, 70, 110, 70, 115, 70, 90);
        add(184, "Azumarill", Type.WATER, Type.FAIRY, 100, 50, 80, 60, 80, 50);
        add(350, "Milotic", Type.WATER, null, 95, 60, 79, 100, 125, 81);
        add(454, "Toxicroak", Type.POISON, Type.FIGHTING, 83, 106, 65, 86, 65, 85);
        add(460, "Abomasnow", Type.GRASS, Type.ICE, 90, 92, 75, 92, 85, 60);
        add(483, "Dialga", Type.STEEL, Type.DRAGON, 100, 120, 120, 150, 100, 90);
        add(484, "Palkia", Type.WATER, Type.DRAGON, 90, 120, 100, 150, 120, 100);

        // ===== 14 extra Pokemon for trainer teams =====
        add(269, "Dustox", Type.BUG, Type.POISON, 60, 50, 70, 50, 90, 65);
        add(267, "Beautifly", Type.BUG, Type.FLYING, 60, 70, 50, 100, 50, 65);
        add(452, "Drapion", Type.POISON, Type.DARK, 70, 90, 110, 60, 75, 95);
        add(195, "Quagsire", Type.WATER, Type.GROUND, 95, 85, 85, 65, 65, 35);
        add(185, "Sudowoodo", Type.ROCK, null, 70, 100, 115, 30, 65, 30);
        add(450, "Hippowdon", Type.GROUND, null, 108, 112, 118, 68, 72, 47);
        add(78,  "Rapidash", Type.FIRE, null, 65, 100, 70, 80, 80, 105);
        add(426, "Drifblim", Type.GHOST, Type.FLYING, 150, 80, 44, 90, 54, 80);
        add(428, "Lopunny", Type.NORMAL, null, 65, 76, 84, 54, 96, 105);
        add(203, "Girafarig", Type.NORMAL, Type.PSYCHIC, 70, 80, 65, 90, 65, 85);
        add(308, "Medicham", Type.FIGHTING, Type.PSYCHIC, 60, 60, 75, 60, 75, 80);
        add(437, "Bronzong", Type.STEEL, Type.PSYCHIC, 67, 89, 116, 79, 116, 33);
        add(442, "Spiritomb", Type.GHOST, Type.DARK, 50, 92, 108, 92, 108, 35);
        add(423, "Gastrodon", Type.WATER, Type.GROUND, 111, 83, 68, 92, 82, 39);
    }

    private static void add(int id, String name, Type t1, Type t2,
                            int hp, int atk, int def, int spa, int spd, int spe) {
        if (BY_ID.containsKey(id)) {
            throw new IllegalStateException("Duplicate species id " + id
                    + " (" + name + " vs " + BY_ID.get(id).getName() + ")");
        }
        if (DEX.containsKey(name)) {
            throw new IllegalStateException("Duplicate species name: " + name);
        }
        Species s = new Species(id, name, t1, t2, hp, atk, def, spa, spd, spe);
        DEX.put(name, s);
        BY_ID.put(id, s);
    }

    public static Species get(String name) {
        Species s = DEX.get(name);
        if (s == null) {
            throw new IllegalArgumentException("Unknown species: " + name);
        }
        return s;
    }

    public static Species get(int id) {
        Species s = BY_ID.get(id);
        if (s == null) {
            throw new IllegalArgumentException("Unknown species id: " + id);
        }
        return s;
    }

    public static Map<String, Species> all() {
        return DEX;
    }

    public static Map<Integer, Species> allById() {
        return BY_ID;
    }
}