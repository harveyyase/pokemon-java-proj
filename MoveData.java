package pokemonbdsp;

import java.util.LinkedHashMap;
import java.util.Map;

public class MoveData {
    private static final Map<String, Move> MOVES = new LinkedHashMap<>();
    private static final Map<Integer, Move> MOVES_BY_ID = new LinkedHashMap<>();
    private static final MoveCategory PHY = MoveCategory.PHYSICAL;
    private static final MoveCategory SPE = MoveCategory.SPECIAL;
    private static final MoveCategory STA = MoveCategory.STATUS;

    // add(name, type, category, power, accuracy, pp)
    // Power/accuracy/PP are simplified; weight-based or variable moves use a flat power.
    static {
        int id = 1; // Starts at 1 and goes up automatically!

        // add(id, name, type, category, power, accuracy, pp)
        add(id++, "Toxic", Type.POISON, STA, 0, 90, 10);
        add(id++, "Bug Buzz", Type.BUG, SPE, 90, 100, 10);
        add(id++, "Moonlight", Type.NORMAL, STA, 0, 0, 5);
        add(id++, "Light Screen", Type.PSYCHIC, STA, 0, 0, 30);
        add(id++, "Shadow Ball", Type.GHOST, SPE, 80, 100, 15);
        add(id++, "Psychic", Type.PSYCHIC, SPE, 90, 100, 10);
        add(id++, "Quiver Dance", Type.BUG, STA, 0, 0, 20);
        add(id++, "Acrobatics", Type.FLYING, PHY, 55, 100, 15);
        add(id++, "Attack Order", Type.BUG, PHY, 90, 100, 15);
        add(id++, "Aerial Ace", Type.FLYING, PHY, 60, 0, 20);
        add(id++, "Defend Order", Type.BUG, STA, 0, 0, 10);
        add(id++, "Earthquake", Type.GROUND, PHY, 100, 100, 10);
        add(id++, "Rock Slide", Type.ROCK, PHY, 75, 90, 10);
        add(id++, "Facade", Type.NORMAL, PHY, 70, 100, 20);
        add(id++, "Brick Break", Type.FIGHTING, PHY, 75, 100, 15);
        add(id++, "Cross Poison", Type.POISON, PHY, 70, 100, 20);
        add(id++, "Night Slash", Type.DARK, PHY, 70, 100, 15);
        add(id++, "X-Scissor", Type.BUG, PHY, 80, 100, 15);
        add(id++, "Recover", Type.NORMAL, STA, 0, 0, 5);
        add(id++, "Surf", Type.WATER, SPE, 90, 100, 15);
        add(id++, "Double-Edge", Type.NORMAL, PHY, 120, 100, 15);
        add(id++, "Head Smash", Type.ROCK, PHY, 150, 80, 5);
        add(id++, "Sucker Punch", Type.DARK, PHY, 70, 100, 5);
        add(id++, "Low Kick", Type.FIGHTING, PHY, 60, 100, 20);
        add(id++, "Rock Polish", Type.ROCK, STA, 0, 0, 20);
        add(id++, "Heavy Slam", Type.STEEL, PHY, 60, 100, 10);
        add(id++, "Stone Edge", Type.ROCK, PHY, 100, 80, 5);
        add(id++, "Bulldoze", Type.GROUND, PHY, 60, 100, 20);
        add(id++, "Ice Beam", Type.ICE, SPE, 90, 100, 10);
        add(id++, "Belch", Type.POISON, SPE, 120, 90, 10);
        add(id++, "Hydro Pump", Type.WATER, SPE, 110, 80, 5);
        add(id++, "Ice Fang", Type.ICE, PHY, 65, 95, 15);
        add(id++, "Crunch", Type.DARK, PHY, 80, 100, 15);
        add(id++, "Rest", Type.PSYCHIC, STA, 0, 0, 10);
        add(id++, "Flame Charge", Type.FIRE, PHY, 50, 100, 20);
        add(id++, "Iron Tail", Type.STEEL, PHY, 100, 75, 15);
        add(id++, "Poison Jab", Type.POISON, PHY, 80, 100, 20);
        add(id++, "Hypnosis", Type.PSYCHIC, STA, 0, 60, 20);
        add(id++, "Thunder Fang", Type.ELECTRIC, PHY, 65, 95, 15);
        add(id++, "Fire Fang", Type.FIRE, PHY, 65, 95, 15);
        add(id++, "Strength Sap", Type.GRASS, STA, 0, 100, 10);
        add(id++, "Minimize", Type.NORMAL, STA, 0, 0, 10);
        add(id++, "Baton Pass", Type.NORMAL, STA, 0, 0, 40);
        add(id++, "Will-O-Wisp", Type.FIRE, STA, 0, 85, 15);
        add(id++, "Mirror Coat", Type.PSYCHIC, SPE, 0, 100, 20);
        add(id++, "High Jump Kick", Type.FIGHTING, PHY, 130, 90, 10);
        add(id++, "Quick Attack", Type.NORMAL, PHY, 40, 100, 30);
        add(id++, "Fire Punch", Type.FIRE, PHY, 75, 100, 15);
        add(id++, "Thunder Punch", Type.ELECTRIC, PHY, 75, 100, 15);
        add(id++, "Close Combat", Type.FIGHTING, PHY, 120, 100, 5);
        add(id++, "Mach Punch", Type.FIGHTING, PHY, 40, 100, 30);
        add(id++, "Reflect", Type.PSYCHIC, STA, 0, 0, 20);
        add(id++, "Dazzling Gleam", Type.FAIRY, SPE, 80, 100, 10);
        add(id++, "Thunderbolt", Type.ELECTRIC, SPE, 90, 100, 15);
        add(id++, "Trick Room", Type.PSYCHIC, STA, 0, 0, 5);
        add(id++, "Zen Headbutt", Type.PSYCHIC, PHY, 80, 90, 15);
        add(id++, "Ice Punch", Type.ICE, PHY, 75, 100, 15);
        add(id++, "Nasty Plot", Type.DARK, STA, 0, 0, 20);
        add(id++, "Future Sight", Type.PSYCHIC, SPE, 120, 100, 10);
        add(id++, "Shock Wave", Type.ELECTRIC, SPE, 60, 0, 20);
        add(id++, "Gyro Ball", Type.STEEL, PHY, 60, 100, 5);
        add(id++, "Payback", Type.DARK, PHY, 50, 100, 10);
        add(id++, "Dark Pulse", Type.DARK, SPE, 80, 100, 15);
        add(id++, "Sludge Bomb", Type.POISON, SPE, 90, 100, 10);
        add(id++, "Energy Ball", Type.GRASS, SPE, 90, 100, 10);
        add(id++, "Scald", Type.WATER, SPE, 80, 100, 15);
        add(id++, "Rock Tomb", Type.ROCK, PHY, 60, 95, 15);
        add(id++, "Aura Sphere", Type.FIGHTING, SPE, 80, 0, 20);
        add(id++, "Dragon Pulse", Type.DRAGON, SPE, 85, 100, 10);
        add(id++, "Flash Cannon", Type.STEEL, SPE, 80, 100, 10);
        add(id++, "Dragon Claw", Type.DRAGON, PHY, 80, 100, 15);
        add(id++, "Swords Dance", Type.NORMAL, STA, 0, 0, 20);
    }

    private static void add(int id, String name, Type type, MoveCategory cat,
                            int power, int acc, int pp) {
        Move m = new Move(id, name, type, cat, power, acc, pp);
        MOVES.put(name, m);
        MOVES_BY_ID.put(id, m);
    }

    public static Move get(String name) {
        Move m = MOVES.get(name);
        if (m == null) {
            throw new IllegalArgumentException("Unknown move: " + name);
        }
        return m;
    }

    public static Map<String, Move> all() {
        return MOVES;
    }

    public static Map<Integer, Move> allById() {
        return MOVES_BY_ID;
    }
}