package pokemonbdsp;

import java.util.ArrayList;
import java.util.List;

public class TrainerData {

    public static EliteFourMember aaron() {
        EliteFourMember t = new EliteFourMember("Aaron", "Elite Four", "Bug");
        t.addPokemon(PokemonFactory.create("Dustox", 53, Nature.BOLD, "Black Sludge",
                "Toxic", "Bug Buzz", "Moonlight", "Light Screen"));
        t.addPokemon(PokemonFactory.create("Beautifly", 53, Nature.MODEST, "Wise Glasses",
                "Bug Buzz", "Shadow Ball", "Psychic", "Quiver Dance"));
        t.addPokemon(PokemonFactory.create("Vespiquen", 54, Nature.ADAMANT, "Sitrus Berry",
                "Acrobatics", "Attack Order", "Aerial Ace", "Defend Order"));
        t.addPokemon(PokemonFactory.create("Heracross", 54, Nature.JOLLY, "Flame Orb",
                "Earthquake", "Rock Slide", "Facade", "Brick Break"));
        t.addPokemon(PokemonFactory.create("Drapion", 57, Nature.JOLLY, "Scope Lens",
                "Cross Poison", "Night Slash", "Earthquake", "X-Scissor"));
        return t;
    }

    public static EliteFourMember bertha() {
        EliteFourMember t = new EliteFourMember("Bertha", "Elite Four", "Ground");
        t.addPokemon(PokemonFactory.create("Quagsire", 55, Nature.IMPISH, "Leftovers",
                "Recover", "Toxic", "Earthquake", "Surf"));
        t.addPokemon(PokemonFactory.create("Sudowoodo", 56, Nature.ADAMANT, "Sitrus Berry",
                "Double-Edge", "Head Smash", "Sucker Punch", "Low Kick"));
        t.addPokemon(PokemonFactory.create("Golem", 56, Nature.JOLLY, "Soft Sand",
                "Rock Polish", "Heavy Slam", "Earthquake", "Stone Edge"));
        t.addPokemon(PokemonFactory.create("Whiscash", 55, Nature.MODEST, "Rindo Berry",
                "Bulldoze", "Ice Beam", "Belch", "Hydro Pump"));
        t.addPokemon(PokemonFactory.create("Hippowdon", 59, Nature.ADAMANT, "Chesto Berry",
                "Ice Fang", "Earthquake", "Crunch", "Rest"));
        return t;
    }

    public static EliteFourMember flint() {
        EliteFourMember t = new EliteFourMember("Flint", "Elite Four", "Fire");
        t.addPokemon(PokemonFactory.create("Rapidash", 58, Nature.JOLLY, "Wide Lens",
                "Flame Charge", "Iron Tail", "Poison Jab", "Hypnosis"));
        t.addPokemon(PokemonFactory.create("Steelix", 57, Nature.ADAMANT, "Life Orb",
                "Thunder Fang", "Fire Fang", "Iron Tail", "Crunch"));
        t.addPokemon(PokemonFactory.create("Drifblim", 58, Nature.TIMID, "Sitrus Berry",
                "Strength Sap", "Minimize", "Baton Pass", "Will-O-Wisp"));
        t.addPokemon(PokemonFactory.create("Lopunny", 57, Nature.JOLLY, "Leftovers",
                "Mirror Coat", "High Jump Kick", "Quick Attack", "Fire Punch"));
        t.addPokemon(PokemonFactory.create("Infernape", 61, Nature.JOLLY, "Focus Sash",
                "Fire Punch", "Thunder Punch", "Close Combat", "Mach Punch"));
        return t;
    }

    public static EliteFourMember lucian() {
        EliteFourMember t = new EliteFourMember("Lucian", "Elite Four", "Psychic");
        t.addPokemon(PokemonFactory.create("Mr. Mime", 59, Nature.BOLD, "Light Clay",
                "Light Screen", "Reflect", "Psychic", "Dazzling Gleam"));
        t.addPokemon(PokemonFactory.create("Girafarig", 59, Nature.CALM, "Mental Herb",
                "Light Screen", "Psychic", "Thunderbolt", "Trick Room"));
        t.addPokemon(PokemonFactory.create("Medicham", 60, Nature.BRAVE, "Muscle Band",
                "Zen Headbutt", "High Jump Kick", "Thunder Punch", "Ice Punch"));
        t.addPokemon(PokemonFactory.create("Alakazam", 60, Nature.TIMID, "Life Orb",
                "Nasty Plot", "Psychic", "Future Sight", "Shock Wave"));
        t.addPokemon(PokemonFactory.create("Bronzong", 63, Nature.BRAVE, "Sitrus Berry",
                "Gyro Ball", "Earthquake", "Payback", "Trick Room"));
        return t;
    }

    public static EliteFourMember cynthia() {
        EliteFourMember t = new EliteFourMember("Cynthia", "Champion", "None");
        t.addPokemon(PokemonFactory.create("Spiritomb", 61, Nature.QUIET, "Sitrus Berry",
                "Shadow Ball", "Dark Pulse", "Psychic", "Sucker Punch"));
        t.addPokemon(PokemonFactory.create("Roserade", 60, Nature.TIMID, "Expert Belt",
                "Dazzling Gleam", "Shadow Ball", "Sludge Bomb", "Energy Ball"));
        t.addPokemon(PokemonFactory.create("Gastrodon", 60, Nature.RELAXED, "Leftovers",
                "Scald", "Earthquake", "Sludge Bomb", "Rock Tomb"));
        t.addPokemon(PokemonFactory.create("Lucario", 63, Nature.TIMID, "Wise Glasses",
                "Aura Sphere", "Dragon Pulse", "Flash Cannon", "Nasty Plot"));
        t.addPokemon(PokemonFactory.create("Milotic", 63, Nature.BOLD, "Flame Orb",
                "Recover", "Mirror Coat", "Ice Beam", "Scald"));
        t.addPokemon(PokemonFactory.create("Garchomp", 66, Nature.JOLLY, "Yache Berry",
                "Dragon Claw", "Earthquake", "Swords Dance", "Poison Jab"));
        return t;
    }

    // In battle order: Aaron, Bertha, Flint, Lucian, Cynthia
    public static List<EliteFourMember> eliteFourAndChampion() {
        List<EliteFourMember> list = new ArrayList<>();
        list.add(aaron());
        list.add(bertha());
        list.add(flint());
        list.add(lucian());
        list.add(cynthia());
        return list;
    }
}