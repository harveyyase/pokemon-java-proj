package pokemonbdsp;

public class HeldItem {
    private final String name;
    private final String description;
    private final boolean playerItem;  // true = one of your 15 choosable items

    public HeldItem(String name, String description, boolean playerItem) {
        this.name = name;
        this.description = description;
        this.playerItem = playerItem;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public boolean isPlayerItem() { return playerItem; }

    @Override
    public String toString() { return name; }
}