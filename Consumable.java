package pokemonbdsp;

public class Consumable {
    private final String name;
    private final String description;
    private final int healAmount;     // HP restored (0 if none)
    private final int revivePercent;  // % of max HP restored on revive (0 if not a revive)

    public static final Consumable HYPER_POTION =
            new Consumable("Hyper Potion", "Restores 120 HP.", 120, 0);
    public static final Consumable REVIVE =
            new Consumable("Revive", "Revives a fainted Pokemon with half HP.", 0, 50);

    public Consumable(String name, String description, int healAmount, int revivePercent) {
        this.name = name;
        this.description = description;
        this.healAmount = healAmount;
        this.revivePercent = revivePercent;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getHealAmount() { return healAmount; }
    public int getRevivePercent() { return revivePercent; }
}