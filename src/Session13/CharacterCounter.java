package Session13;

import java.util.HashMap;

public class CharacterCounter {
    public static void main(String[] args) {
        String text = "Title is the debut major-label studio album by "+
                "American singer-songwriter Meghan Trainor (pictured), " +
                "released on January 9, 2015. Initially a songwriter for other artists in 2013, " +
                "Trainor signed with Epic Records the following year and began recording material " +
                "she co-wrote with Kevin Kadish. They drew influence from retro-styled music as " +
                "they were tired of chasing radio trends. Title includes \"All About That Bass\", " +
                "which reached number one in 58 countries, and two other US Billboard Hot 100 top-10 singles:" +
                " \"Lips Are Movin\" and \"Like I'm Gonna Lose You\".";
        HashMap<Character, Integer> characterCount = countCharacterRepetitions(text);
        System.out.println(characterCount);
    }

    public static HashMap<Character, Integer> countCharacterRepetitions(String text) {
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (characterCount.containsKey(c)) {
                int counter = characterCount.get(c) + 1;
                characterCount.put(c, counter);
            } else {
                characterCount.put(c, 1);
            }
        }

        return characterCount;
    }
}