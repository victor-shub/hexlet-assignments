package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        int[] nums = {5, 99, 0, 20, 20, 8, 30, 1, 0};
        List<Integer> list = new ArrayList<>();
        for (var num: nums) {
            list.add(num);
        }

        var count = 3;
        var actual1 = App.take(list, count);
        List<Integer> expected1 = new ArrayList<>();
        for (var i = 0; i < count; i++) {
            expected1.add(nums[i]);
        }
        assertThat(actual1).isEqualTo(expected1);

        var actual2 = App.take(list, 12);
        var expected2 = list;
        assertThat(actual2).isEqualTo(expected2);

        List<Integer> emptyList = new ArrayList<>();
        var actual3 = App.take(emptyList, 25);
        var expected3 = emptyList;
        assertThat(actual3).isEqualTo(expected3);

        var actual4 = App.take(list, 0);
        var expected4 = emptyList;
        assertThat(actual4).isEqualTo(expected4);
        // END
    }
}
