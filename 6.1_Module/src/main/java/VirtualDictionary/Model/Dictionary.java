package VirtualDictionary.Model;

import java.util.HashMap;

public class Dictionary {

    private final HashMap<String, String> dictionary = new HashMap<>();

    public Dictionary() {
        dictionary.put("apple", "a fruit");
        dictionary.put("book", "a set of written or printed pages");
        dictionary.put("cat", "a small domesticated carnivorous mammal");
        dictionary.put("dog", "a domesticated carnivorous mammal");
        dictionary.put("elephant", "a large herbivorous mammal");
        dictionary.put("fish", "a limbless cold-blooded vertebrate animal");
        dictionary.put("guitar", "a stringed musical instrument");
        dictionary.put("house", "a building for human habitation");
        dictionary.put("ice", "frozen water");
        dictionary.put("jacket", "an outer garment extending either to the waist or the hips");
        dictionary.put("kite", "a toy consisting of a light frame with thin material stretched over it");
        dictionary.put("lamp", "a device for giving light");
        dictionary.put("mountain", "a large natural elevation of the earth's surface");
        dictionary.put("notebook", "a small book with blank or ruled pages for writing notes");
        dictionary.put("orange", "a citrus fruit");
        dictionary.put("piano", "a large keyboard musical instrument");
        dictionary.put("queen", "the female ruler of an independent state");
        dictionary.put("river", "a large natural stream of water");
        dictionary.put("sun", "the star around which the earth orbits");
        dictionary.put("tree", "a woody perennial plant");
    }

    public boolean checkDictonaryItem(String key) {
        return dictionary.containsKey(key);
    }

    public String getMeaning(String key) {
        if (checkDictonaryItem(key)) {
            return dictionary.get(key);
        } else {
            return "Word not found!";
        }
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }
}
