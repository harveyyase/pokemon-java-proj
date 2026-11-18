package pokemonbdsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trainer {
    private final String name;
    private final List<Pokemon> team = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public void addPokemon(Pokemon p) {
        if (team.size() >= 6) {
            throw new IllegalStateException("A team can have at most 6 Pokemon.");
        }
        team.add(p);
    }

    public String getName() { return name; }
    public List<Pokemon> getTeam() { return Collections.unmodifiableList(team); }
}