package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String lettersString, String word) {
        char[] lettersArray = lettersString.toCharArray();
        List<Character> lettersList = new ArrayList<>(lettersArray.length);
        for (var letter: lettersArray) {
            lettersList.add(letter);
        }
        char[] wordCharArray = word.toLowerCase().toCharArray();
        for (var wordLetter: wordCharArray) {
            if (!lettersList.contains(wordLetter)) {
                return false;
            }
            lettersList.remove(wordLetter);
        }
        return true;
    }
}
//END
