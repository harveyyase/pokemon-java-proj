package pokemonbdsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pokemon {
    private static final int IV = 31;  // fixed for simplicity
    private static final int EV = 0;

    private final Species species;
    private final int level;
    private final Nature nature;
    private final HeldItem heldItem;       // can be null
    private final List<Move> moves = new ArrayList<>();
    private int currentHp;

    public Pokemon(Species species, int level, Nature nature,
                   HeldItem heldItem, List<Move> moves) {
        if (moves.size() > 4) {
            throw new IllegalArgumentException("A Pokemon can have at most 4 moves.");
        }
        this.species = species;
        this.level = level;
        this.nature = nature;
        this.heldItem = heldItem;
        this.moves.addAll(moves);
        this.currentHp = getMaxHp();
    }

    public int getStat(Stat stat) {
        int base = species.getBaseStat(stat);
        int core = (2 * base + IV + EV / 4) * level / 100;
        if (stat == Stat.HP) {
            return core + level + 10;
        }
        int value = core + 5;
        if (nature.getPlus() == stat) {
            value = value * 110 / 100;
        } else if (nature.getMinus() == stat) {
            value = value * 90 / 100;
        }
        return value;
    }

    public int getMaxHp() { return getStat(Stat.HP); }
    public int getCurrentHp() { return currentHp; }
    public boolean isFainted() { return currentHp <= 0; }

    public void setCurrentHp(int hp) {
        this.currentHp = Math.max(0, Math.min(hp, getMaxHp()));
    }

    public Species getSpecies() { return species; }
    public int getLevel() { return level; }
    public Nature getNature() { return nature; }
    public HeldItem getHeldItem() { return heldItem; }
    public List<Move> getMoves() { return Collections.unmodifiableList(moves); }

    @Override
    public String toString() {
        return species.getName() + " Lv" + level + " (" + currentHp + "/" + getMaxHp() + " HP)";
    }
}