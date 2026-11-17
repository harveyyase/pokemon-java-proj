package pokemonbdsp;

public class Move {
    private final String name;
    private final Type type;
    private final MoveCategory category;
    private final int power;     // 0 for status moves
    private final int accuracy;  // 0 = never misses / not applicable
    private final int pp;

    public Move(String name, Type type, MoveCategory category,
                int power, int accuracy, int pp) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
    }

    public String getName() { return name; }
    public Type getType() { return type; }
    public MoveCategory getCategory() { return category; }
    public int getPower() { return power; }
    public int getAccuracy() { return accuracy; }
    public int getPp() { return pp; }

    @Override
    public String toString() {
        return name + " (" + type + ", " + category + ")";
    }
}