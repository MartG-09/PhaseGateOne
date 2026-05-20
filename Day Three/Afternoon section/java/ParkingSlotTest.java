import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSlotTest {
    
        @Test
            public void testThatParkingSlotExists() {
                int[] array = {1 , 3 , 9 ,0 , 0 , 0 , 0 , 34 , 78 , 653 , 82 , 0 , 34 , 8 , 21 , 4 , 6 , 0 , 0 , 23};
             
            }    
    
        @Test
            public void testThatParkingSlotCheckForFreeSlot() {
                int[] array = {1 , 3 , 9 ,0 , 0 , 0 , 0 , 34 , 78 , 653 , 82 , 0 , 34 , 8 , 21 , 4 , 6 , 0 , 0 , 23};
                int actual = ParkingSlot.checkForFreeSlot(array);
                int expected = 7;
                assertEquals(actual , expected);
            }
    
        @Test
            public void testThatParkingSlotPrintCheckForFreeSlot() {
                int[] array = {1 , 3 , 9 ,0 , 0 , 0 , 0 , 34 , 78 , 653 , 82 , 0 , 34 , 8 , 21 , 4 , 6 , 0 , 0 , 23};
                String actual = ParkingSlot.printCheckForFreeSlot(array);
                String expected = "13 slot taken , there are 7 Left";
                assertEquals(actual , expected);

            }
        @Test
            public void testThatParkingSlotPrintCheckForEmptySlot() {
                int[] array = {1 , 3 , 9 ,9 , 35 , 8 , 3 , 34 , 78 , 653 , 82 , 56 , 34 , 8 , 21 , 4 , 6 , 99 , 23 , 23};
                String actual = ParkingSlot.printCheckForFreeSlot(array);
                String expected = "20 slot taken , No slot left";
                assertEquals(actual , expected);
        }


}
