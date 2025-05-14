package collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class SmapleCode_Hashmap {
    public static void main(String[] args) {
        String str = "aappllee";
        // initialisation of hash map
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        // convert string to character array
        char[] arr = str.toCharArray();
        // get the lenght of the character array
        System.out.println("The length of character array : " + arr.length);


        for (char value : arr) {
            // validate the item coming in is a character
            if (Character.isAlphabetic(value)) {
                // validate whether the charmap contains the value or not
                if (charMap.containsKey(value)) {
                    // value is repeated add the value
                    charMap.put(value, charMap.get(value) + 1);

                } else {
                    // Value is not repeated
                    charMap.put(value, 1);
                }
            }
        }
//		Character val = Collections.min(charMap.entrySet(), Map.Entry.comparingByKey()).getKey();
//		System.out.println(val);
        System.out.println(charMap);
    }
}
