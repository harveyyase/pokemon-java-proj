package pokemonbdsp;

import java.util.LinkedHashMap;
import java.util.Map;

public class MoveData {
    private static final Map<String, Move> MOVES = new LinkedHashMap<>();
    private static final MoveCategory PHY = MoveCategory.PHYSICAL;
    private static final MoveCategory SPE = MoveCategory.SPECIAL;
    private static final MoveCategory STA = MoveCategory.STATUS;

    static {
        // add(name, type, category, power, accuracy, pp)
        // Power/accuracy/PP are simplified; weight-based or variable moves use a flat power.
        add("Toxic", Type.POISON, STA, 0, 90, 10);
        add("Bug Buzz", Type.BUG, SPE, 90, 100, 10);
        add("Moonlight", Type.NORMAL, STA, 0, 0, 5);
        add("Light Screen", Type.PSYCHIC, STA, 0, 0, 30);
        add("Shadow Ball", Type.GHOST, SPE, 80, 100, 15);
        add("Psychic", Type.PSYCHIC, SPE, 90, 100, 10);
        add("Quiver Dance", Type.BUG, STA, 0, 0, 20);
        add("Acrobatics", Type.FLYING, PHY, 55, 100, 15);
        add("Attack Order", Type.BUG, PHY, 90, 100, 15);
        add("Aerial Ace", Type.FLYING, PHY, 60, 0, 20);
        add("Defend Order", Type.BUG, STA, 0, 0, 10);
        add("Earthquake", Type.GROUND, PHY, 100, 100, 10);
        add("Rock Slide", Type.ROCK, PHY, 75, 90, 10);
        add("Facade", Type.NORMAL, PHY, 70, 100, 20);
        add("Brick Break", Type.FIGHTING, PHY, 75, 100, 15);
        add("Cross Poison", Type.POISON, PHY, 70, 100, 20);
        add("Night Slash", Type.DARK, PHY, 70, 100, 15);
        add("X-Scissor", Type.BUG, PHY, 80, 100, 15);
        add("Recover", Type.NORMAL, STA, 0, 0, 5);
        add("Surf", Type.WATER, SPE, 90, 100, 15);
        add("Double-Edge", Type.NORMAL, PHY, 120, 100, 15);
        add("Head Smash", Type.ROCK, PHY, 150, 80, 5);
        add("Sucker Punch", Type.DARK, PHY, 70, 100, 5);
        add("Low Kick", Type.FIGHTING, PHY, 60, 100, 20);
        add("Rock Polish", Type.ROCK, STA, 0, 0, 20);
        add("Heavy Slam", Type.STEEL, PHY, 60, 100, 10);
        add("Stone Edge", Type.ROCK, PHY, 100, 80, 5);
        add("Bulldoze", Type.GROUND, PHY, 60, 100, 20);
        add("Ice Beam", Type.ICE, SPE, 90, 100, 10);
        add("Belch", Type.POISON, SPE, 120, 90, 10);
        add("Hydro Pump", Type.WATER, SPE, 110, 80, 5);
        add("Ice Fang", Type.ICE, PHY, 65, 95, 15);
        add("Crunch", Type.DARK, PHY, 80, 100, 15);
        add("Rest", Type.PSYCHIC, STA, 0, 0, 10);
        add("Flame Charge", Type.FIRE, PHY, 50, 100, 20);
        add("Iron Tail", Type.STEEL, PHY, 100, 75, 15);
        add("Poison Jab", Type.POISON, PHY, 80, 100, 20);
        add("Hypnosis", Type.PSYCHIC, STA, 0, 60, 20);
        add("Thunder Fang", Type.ELECTRIC, PHY, 65, 95, 15);
        add("Fire Fang", Type.FIRE, PHY, 65, 95, 15);
        add("Strength Sap", Type.GRASS, STA, 0, 100, 10);
        add("Minimize", Type.NORMAL, STA, 0, 0, 10);
        add("Baton Pass", Type.NORMAL, STA, 0, 0, 40);
        add("Will-O-Wisp", Type.FIRE, STA, 0, 85, 15);
        add("Mirror Coat", Type.PSYCHIC, SPE, 0, 100, 20);
        add("High Jump Kick", Type.FIGHTING, PHY, 130, 90, 10);
        add("Quick Attack", Type.NORMAL, PHY, 40, 100, 30);
        add("Fire Punch", Type.FIRE, PHY, 75, 100, 15);
        add("Thunder Punch", Type.ELECTRIC, PHY, 75, 100, 15);
        add("Close Combat", Type.FIGHTING, PHY, 120, 100, 5);
        add("Mach Punch", Type.FIGHTING, PHY, 40, 100, 30);
        add("Reflect", Type.PSYCHIC, STA, 0, 0, 20);
        add("Dazzling Gleam", Type.FAIRY, SPE, 80, 100, 10);
        add("Thunderbolt", Type.ELECTRIC, SPE, 90, 100, 15);
        add("Trick Room", Type.PSYCHIC, STA, 0, 0, 5);
        add("Zen Headbutt", Type.PSYCHIC, PHY, 80, 90, 15);
        add("Ice Punch", Type.ICE, PHY, 75, 100, 15);
        add("Nasty Plot", Type.DARK, STA, 0, 0, 20);
        add("Future Sight", Type.PSYCHIC, SPE, 120, 100, 10);
        add("Shock Wave", Type.ELECTRIC, SPE, 60, 0, 20);
        add("Gyro Ball", Type.STEEL, PHY, 60, 100, 5);
        add("Payback", Type.DARK, PHY, 50, 100, 10);
        add("Dark Pulse", Type.DARK, SPE, 80, 100, 15);
        add("Sludge Bomb", Type.POISON, SPE, 90, 100, 10);
        add("Energy Ball", Type.GRASS, SPE, 90, 100, 10);
        add("Scald", Type.WATER, SPE, 80, 100, 15);
        add("Rock Tomb", Type.ROCK, PHY, 60, 95, 15);
        add("Aura Sphere", Type.FIGHTING, SPE, 80, 0, 20);
        add("Dragon Pulse", Type.DRAGON, SPE, 85, 100, 10);
        add("Flash Cannon", Type.STEEL, SPE, 80, 100, 10);
        add("Dragon Claw", Type.DRAGON, PHY, 80, 100, 15);
        add("Swords Dance", Type.NORMAL, STA, 0, 0, 20);
    }

    private static void add(String name, Type type, MoveCategory cat,
                            int power, int acc, int pp) {
        MOVES.put(name, new Move(name, type, cat, power, acc, pp));
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
}