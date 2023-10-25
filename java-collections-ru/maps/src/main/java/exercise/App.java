package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();
        return wordsCount;
    }

    public static String toString(Map<String, Integer> map) {
        var result = new StringBuilder();
        result.append("{/n");
        for (Map.Entry<String, Integer> keyValuePair : map.entrySet()) {
            result.append("  ").append(keyValuePair.getKey()).append(": ").append(keyValuePair.getValue()).append("/n");
        }
        result.append("}");
        return result.toString();
    }
}
//END
