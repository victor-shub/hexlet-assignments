package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String confFileText) {
        var forwarder = "X_FORWARDED_";
        var envCommand = "environment=\"";
        String variables = confFileText.lines()
                .filter(line -> line.startsWith(envCommand))
                .map(line -> line.replace(envCommand, ""))
                .map(line -> line.split(","))
                .flatMap(Arrays::stream)
                .filter(varString -> varString.startsWith(forwarder))
                .map(varString -> varString.replace(forwarder, ""))
                .map(varString -> varString.replace("\"", ""))
                .collect(Collectors.joining(","));
        return variables;
    }
}
//END
