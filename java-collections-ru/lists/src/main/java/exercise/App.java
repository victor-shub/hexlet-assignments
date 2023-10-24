package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String lettersString, String word) {
        char[] lettersArray = lettersString.toCharArray();
        List<Character> lettersList = new ArrayList<>(lettersArray.length);
        for (var letter: lettersArray) {
            lettersList.add(letter);
        }
        char[] wordCharArray = word.toLowerCase().toCharArray();
        for (char wordLetter: wordCharArray) {
            if (!lettersList.contains(wordLetter)) {
                return false;
            }
            var index = lettersList.indexOf(wordLetter);
            lettersList.set(index, null);
        }
        return true;
    }
}
//END
