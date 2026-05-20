import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FireDrillOneTest {

    @Test
        public void TestThatFireDrillOneExists(){
            String[] array = {"Peter"};
            FireDrillOne.displayTest(array);
        }

    @Test
        public void TestThatEmptyArrayReturnsTheRightText() {
             String[] array = {};
             String expected = "no one likes this";
             String actual = FireDrillOne.displayTest(array);         
             assertEquals(actual , expected);      
        }

    @Test
        public void TestThatArrayWithOneElementReturnsTheRightText() {
             String[] array = {"Peter"};
             String expected = "Peter likes this";
             String actual = FireDrillOne.displayTest(array);         
             assertEquals(actual , expected);      
        }

    @Test
        public void TestThatArrayWithTwoElementsReturnsTheRightText() {
             String[] array = {"Jacob" , "Alex"};
             String expected = "Jacob and Alex likes this";
             String actual = FireDrillOne.displayTest(array);         
             assertEquals(actual , expected);      
        }

    @Test
        public void TestThatArrayWithThreeElementsReturnsTheRightText() {
             String[] array = {"Jacob" , "Alex" , "Max"};
             String expected = "Jacob, Alex and Max likes this";
             String actual = FireDrillOne.displayTest(array);         
             assertEquals(actual , expected);      
        }

    @Test
        public void TestThatArrayWithMoreThanThreeElementsReturnsTheRightText() {
             String[] array = {"Jacob" , "Alex" , "Max" , "Mark" , "John"};
             String expected = "Jacob, Alex and 3 others likes this";
             String actual = FireDrillOne.displayTest(array);         
             assertEquals(actual , expected);      
        }















}
