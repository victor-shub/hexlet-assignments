package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String confFileText) {
        var envLines = confFileText.lines()
                .filter(line -> line.startsWith("environment="))
                .toArray();

    }
}
//END
