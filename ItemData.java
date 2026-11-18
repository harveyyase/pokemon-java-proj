package pokemonbdsp;

import java.util.LinkedHashMap;
import java.util.Map;

public class ItemData {
    private static final Map<String, HeldItem> ITEMS = new LinkedHashMap<>();
    private static final Map<Integer, HeldItem> ITEMS_BY_ID = new LinkedHashMap<>();

    static {
        int id = 1;

        // ===== Your 15 held items =====
        add(id++, "Choice Specs", "Boosts Sp. Atk, locks into one move.", true);
        add(id++, "Choice Band", "Boosts Attack, locks into one move.", true);
        add(id++, "Choice Scarf", "Boosts Speed, locks into one move.", true);
        add(id++, "Life Orb", "Boosts move damage, costs HP on attack.", true);
        add(id++, "Dragon Fang", "Boosts Dragon-type moves.", true);
        add(id++, "Expert Belt", "Boosts super-effective moves.", true);
        add(id++, "Focus Sash", "Survive one KO hit from full HP.", true);
        add(id++, "Leftovers", "Restores a bit of HP each turn.", true);
        add(id++, "Light Ball", "Boosts Pikachu's attacking stats.", true);
        add(id++, "Quick Claw", "Sometimes lets the holder move first.", true);
        add(id++, "Razor Claw", "Raises critical hit chance.", true);
        add(id++, "Shell Bell", "Restores HP from damage dealt.", true);
        add(id++, "Sitrus Berry", "Restores HP when low (one time).", true);
        add(id++, "Adamant Orb", "Boosts Dialga's Dragon and Steel moves.", true);
        add(id++, "Lustrous Orb", "Boosts Palkia's Dragon and Water moves.", true);

        // ===== Extra items used only by trainers =====
        add(id++, "Black Sludge", "Heals Poison types, hurts others.", false);
        add(id++, "Wise Glasses", "Boosts special moves.", false);
        add(id++, "Flame Orb", "Burns the holder.", false);
        add(id++, "Scope Lens", "Raises critical hit chance.", false);
        add(id++, "Soft Sand", "Boosts Ground-type moves.", false);
        add(id++, "Rindo Berry", "Weakens a super-effective Grass move once.", false);
        add(id++, "Chesto Berry", "Cures sleep once.", false);
        add(id++, "Wide Lens", "Boosts accuracy.", false);
        add(id++, "Light Clay", "Makes Reflect and Light Screen last longer.", false);
        add(id++, "Mental Herb", "Cures infatuation and similar effects once.", false);
        add(id++, "Muscle Band", "Boosts physical moves.", false);
        add(id++, "Yache Berry", "Weakens a super-effective Ice move once.", false);
    }

    private static void add(int id, String name, String desc, boolean player) {
        HeldItem item = new HeldItem(id, name, desc, player);
        ITEMS.put(name, item);
        ITEMS_BY_ID.put(id, item);
    }

    public static HeldItem get(String name) {
        HeldItem item = ITEMS.get(name);
        if (item == null) {
            throw new IllegalArgumentException("Unknown item: " + name);
        }
        return item;
    }

    // NEW: Get by ID method
    public static HeldItem get(int id) {
        HeldItem item = ITEMS_BY_ID.get(id);
        if (item == null) {
            throw new IllegalArgumentException("Unknown item id: " + id);
        }
        return item;
    }

    public static Map<String, HeldItem> all() {
        return ITEMS;
    }

    public static Map<Integer, HeldItem> allById() {
        return ITEMS_BY_ID;
    }
}