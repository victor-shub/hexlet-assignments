package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        var workSentence = sentence.strip() + " ";
        Map<String, Integer> wordsCount = new HashMap<>();
        while (!workSentence.isEmpty()) {
            var spaceIndex = workSentence.indexOf(" ");
            var word = workSentence.substring(0, spaceIndex);
            if (wordsCount.containsKey(word)) {
                var count = wordsCount.get(word);
                wordsCount.replace(word, count + 1);
            } else {
                if (!word.isEmpty()) {
                    wordsCount.put(word, 1);
                }
            }
            workSentence = workSentence.substring(spaceIndex + 1);
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        var result = new StringBuilder();
        result.append("{\n");
        for (Map.Entry<String, Integer> keyValuePair : map.entrySet()) {
            result.append("  ").append(keyValuePair.getKey()).append(": ").append(keyValuePair.getValue()).append("\n");
        }
        result.append("}");
        return result.toString();
    }
}
//END
