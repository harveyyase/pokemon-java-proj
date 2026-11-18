package pokemonbdsp;

public class Species {
    private final int id;
    private final String name;
    private final Type type1;
    private final Type type2;   // null if single-typed
    private final int hp, attack, defense, spAttack, spDefense, speed;

    public Species(int id, String name, Type type1, Type type2,
                   int hp, int attack, int defense,
                   int spAttack, int spDefense, int speed) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public Type getType1() { return type1; }
    public Type getType2() { return type2; }

    public int getBaseStat(Stat stat) {
        switch (stat) {
            case HP: return hp;
            case ATTACK: return attack;
            case DEFENSE: return defense;
            case SP_ATTACK: return spAttack;
            case SP_DEFENSE: return spDefense;
            default: return speed;
        }
    }

    @Override
    public String toString() {
        String types = (type2 == null) ? type1.toString() : type1 + "/" + type2;
        return name + " [" + types + "]";
    }
}