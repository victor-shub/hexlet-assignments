package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] originArray) {
        if (originArray.length == 0) {
            return originArray;
        }
        String[][] enlargedArray = new String[originArray.length * 2][originArray[0].length * 2];
        for (var i = 0; i < originArray.length; i++) {
            for (var j = 0; j < originArray[0].length; j++) {
                enlargedArray[i * 2][j * 2] = originArray[i][j];
                enlargedArray[i * 2][j * 2 + 1] = originArray[i][j];
            }
            enlargedArray[i * 2 + 1] = enlargedArray[i * 2];
        }
        return enlargedArray;
    }
}
// END
