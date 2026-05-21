import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DescendingTest {

        @Test
            public void testThatDescendingExists() {
                int[] array = {12 , 3 , 2 , 9 , 3 , 14 , 10};
                Descending.descendOrder(array);
            }

        @Test
            public void testThatDescendingGivesCorrectValue() {
                int[] array = {12 , 3 , 2 , 9 , 3 , 14 , 10};
                int[] expected = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
                int[] actual = Descending.descendOrder(array);
                assertArrayEquals(actual , expected);
            }

}
