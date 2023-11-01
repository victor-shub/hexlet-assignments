package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testAppWithEmptyArray() {
        String[][] originArray = new String[0][];
        String[][] actual = App.enlargeArrayImage(originArray);
        var expected = originArray;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testAppWithOneLine() {
        String[][] originArray = {{" ", "*", " ", "%", "*"}};
        String[][] actual = App.enlargeArrayImage(originArray);
        String[][] expected = {
                {" ", " ", "*", "*", " ", " ", "%", "%", "*", "*"},
                {" ", " ", "*", "*", " ", " ", "%", "%", "*", "*"}
        };
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testAppWithOneColumn() {
        String[][] originArray = {{"*"}, {"%"}, {" "}, {"*"}, {" "}};
        String[][] actual = App.enlargeArrayImage(originArray);
        String[][] expected = {
                {"*", "*"},
                {"*", "*"},
                {"%", "%"},
                {"%", "%"},
                {" ", " "},
                {" ", " "},
                {"*", "*"},
                {"*", "*"},
                {" ", " "},
                {" ", " "},
        };
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testApp() {
        String[][] originArray = {
                {"*", "%", "*", "*"},
                {" ", "*", " ", "%"},
                {" ", "%", "*", " "},
                {"*", " ", " ", " "},
                {" ", " ", "*", "*"}
        };
        String[][] actual = App.enlargeArrayImage(originArray);
        String[][] expected = {
                {"*", "*", "%", "%", "*", "*", "*", "*"},
                {"*", "*", "%", "%", "*", "*", "*", "*"},
                {" ", " ", "*", "*", " ", " ", "%", "%"},
                {" ", " ", "*", "*", " ", " ", "%", "%"},
                {" ", " ", "%", "%", "*", "*", " ", " "},
                {" ", " ", "%", "%", "*", "*", " ", " "},
                {"*", "*", " ", " ", " ", " ", " ", " "},
                {"*", "*", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", "*", "*", "*", "*"},
                {" ", " ", " ", " ", "*", "*", "*", "*"}
        };
        assertThat(actual).isEqualTo(expected);
    }
}
// END
