package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();
        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        for (Map.Entry<String, Integer> wordCount: wordsCount.entrySet()) {
            System.out.println(wordCount.getKey() + ": " + wordCount.getValue());
        }
        return "";
    }
}
//END
