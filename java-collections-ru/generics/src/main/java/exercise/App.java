package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static <K, V> List<Map<K, V>> findWhere(List<Map<K, V>> listOfMaps, Map<K, V> mapToFind) {
        List<Map<K, V>> listOfMapsWhere = new ArrayList<>();
        for (var map: listOfMaps) {
            if (map.entrySet().containsAll(mapToFind.entrySet())) {
                listOfMapsWhere.add(map);
            }
        }
        return listOfMapsWhere;
    }
}
//END
