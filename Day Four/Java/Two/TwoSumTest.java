import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

        @Test
            public void testThatTwoSumExists() {
                int[] array = {8 , 6 , 12 , 4 , -2};
                int number = 6;
                TwoSum.checkTwoNumber(array , number);
            }

        @Test
            public void testThatTwoSumReturnsTwoNumber() {
                int[] array = {8 , 6 , 12 , 4 , -2};
                int number = 6;
                int[] expected = {-2 , 8};
                int[] actual = TwoSum.checkTwoNumber(array , number);
                assertArrayEquals(expected , actual);
            }


}
