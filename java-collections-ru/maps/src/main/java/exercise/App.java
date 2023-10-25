package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        var workSentence = sentence.strip() + " ";
        Map<String, Integer> wordsCount = new HashMap<>();
        System.out.println("wordsCount = " + wordsCount);
        System.out.println("workSentence = " + workSentence);
        while (!workSentence.isEmpty()) {
            var spaceIndex = workSentence.indexOf(" ");
            System.out.println("spaceIndex = " + spaceIndex);
            var word = workSentence.substring(0, spaceIndex);
            System.out.println("word = " + word);
            if (wordsCount.containsKey(word)) {
                var count = wordsCount.get(word);
                System.out.println("count = " + count);
                wordsCount.replace(word, count + 1);
            } else {
                if (!word.isEmpty()) {
                    System.out.println("count = 0");
                    wordsCount.put(word, 1);
                }
            }
            workSentence = workSentence.substring(spaceIndex + 1);
            System.out.println("workSentence = " + workSentence);
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> map) {
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
