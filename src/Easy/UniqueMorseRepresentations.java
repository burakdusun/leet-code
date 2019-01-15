package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseRepresentations {

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    private static int uniqueMorseRepresentations(String[] words) {
        Map<String, String> morseMap = new HashMap<>();
        String[] morseAlphabet = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (char i = 'a'; i <= 'z'; i++) {
            morseMap.put(String.valueOf(i), morseAlphabet[(int) i - 'a']);
        }
        Set<String> transformedWords = new HashSet<>();
        for (String word : words) {
            StringBuilder transformedWord = new StringBuilder(12);
            for (char character : word.toCharArray()) {
                transformedWord.append(morseMap.get(String.valueOf(character)));
            }
            transformedWords.add(transformedWord.toString());
        }
        return transformedWords.size();
    }
}
