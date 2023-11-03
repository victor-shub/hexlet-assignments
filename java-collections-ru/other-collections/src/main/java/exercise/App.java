package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        LinkedHashMap<String, String> diffMap = new LinkedHashMap<>();
        Set<String> allKeySet = new TreeSet<>();
        allKeySet.addAll(map1.keySet());
        allKeySet.addAll(map2.keySet());
        allKeySet.stream()
                .forEach(key -> diffMap.put(key, getDiff(key, map1, map2)));
        return diffMap;
    }

    private static String getDiff(String key, Map<String, Object> map1, Map<String, Object> map2) {
        if (!map1.containsKey(key) && !map2.containsKey(key)) {
            return null;
        } else if (map1.containsKey(key) && !map2.containsKey(key)) {
            return "deleted";
        } else if (!map1.containsKey(key) && map2.containsKey(key)) {
            return "added";
        }
        if (map1.get(key).equals(map2.get(key))) {
            return "unchanged";
        }
        return "changed";
    }
}
//END
