package pokemonbdsp;

import java.util.LinkedHashMap;
import java.util.Map;

public class ItemData {
    private static final Map<String, HeldItem> ITEMS = new LinkedHashMap<>();

    static {
        // ===== Your 15 held items =====
        add("Choice Specs", "Boosts Sp. Atk, locks into one move.", true);
        add("Choice Band", "Boosts Attack, locks into one move.", true);
        add("Choice Scarf", "Boosts Speed, locks into one move.", true);
        add("Life Orb", "Boosts move damage, costs HP on attack.", true);
        add("Dragon Fang", "Boosts Dragon-type moves.", true);
        add("Expert Belt", "Boosts super-effective moves.", true);
        add("Focus Sash", "Survive one KO hit from full HP.", true);
        add("Leftovers", "Restores a bit of HP each turn.", true);
        add("Light Ball", "Boosts Pikachu's attacking stats.", true);
        add("Quick Claw", "Sometimes lets the holder move first.", true);
        add("Razor Claw", "Raises critical hit chance.", true);
        add("Shell Bell", "Restores HP from damage dealt.", true);
        add("Sitrus Berry", "Restores HP when low (one time).", true);
        add("Adamant Orb", "Boosts Dialga's Dragon and Steel moves.", true);
        add("Lustrous Orb", "Boosts Palkia's Dragon and Water moves.", true);

        // ===== Extra items used only by trainers =====
        add("Black Sludge", "Heals Poison types, hurts others.", false);
        add("Wise Glasses", "Boosts special moves.", false);
        add("Flame Orb", "Burns the holder.", false);
        add("Scope Lens", "Raises critical hit chance.", false);
        add("Soft Sand", "Boosts Ground-type moves.", false);
        add("Rindo Berry", "Weakens a super-effective Grass move once.", false);
        add("Chesto Berry", "Cures sleep once.", false);
        add("Wide Lens", "Boosts accuracy.", false);
        add("Light Clay", "Makes Reflect and Light Screen last longer.", false);
        add("Mental Herb", "Cures infatuation and similar effects once.", false);
        add("Muscle Band", "Boosts physical moves.", false);
        add("Yache Berry", "Weakens a super-effective Ice move once.", false);
    }

    private static void add(String name, String desc, boolean player) {
        ITEMS.put(name, new HeldItem(name, desc, player));
    }

    public static HeldItem get(String name) {
        HeldItem item = ITEMS.get(name);
        if (item == null) {
            throw new IllegalArgumentException("Unknown item: " + name);
        }
        return item;
    }

    public static Map<String, HeldItem> all() {
        return ITEMS;
    }
}