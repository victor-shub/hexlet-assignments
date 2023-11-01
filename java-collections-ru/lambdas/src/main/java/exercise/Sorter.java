package exercise;

import java.time.LocalDate;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        List<String> oldestMans = users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .sorted((user1, user2) -> {
                    LocalDate date1 = LocalDate.parse(user1.get("birthday"));
                    LocalDate date2 = LocalDate.parse(user2.get("birthday"));
                    return date1.compareTo(date2);
                })
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
        return oldestMans;
    }
}
// END
