package revrsenumberlist;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class HowTest {
How how = new How();
    @Test
    void getNumberList() {
        List<Integer> original = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> actual = how.getSeveralNumber(original);

        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void getNumberListTwo() {
        List<Integer> original = Arrays.asList(-1, 0);

        List<Integer> actual = how.getSeveralNumber(original);

        List<Integer> expected = Arrays.asList(0, -1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNumberListThree() {
        List<Integer> original = Arrays.asList(458);

        List<Integer> actual = how.getSeveralNumber(original);

        List<Integer> expected = Arrays.asList(458);
        Assertions.assertEquals(expected, actual);
    }
}