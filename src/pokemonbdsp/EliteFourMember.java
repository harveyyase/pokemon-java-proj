package pokemonbdsp;

public class EliteFourMember extends Trainer {
    private final String title;      // e.g. "Elite Four" or "Champion"
    private final String specialty;  // e.g. "Bug-type"

    public EliteFourMember(String name, String title, String specialty) {
        super(name);
        this.title = title;
        this.specialty = specialty;
    }

    public String getTitle() { return title; }
    public String getSpecialty() { return specialty; }
}