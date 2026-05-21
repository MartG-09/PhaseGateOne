import java.util.Arrays;
public class Descending {
        public static int[] descendOrder(int[] array) {

                int largest = 0;
                for (int count = 0; count < array.length; count++) {
                                if (largest < array[count]) {
                                    largest = array[count];
                        }
                }

                int smallest = array[0];
                for (int count = 0; count < array.length; count++) {
                                if (smallest > array[count]) {
                                    smallest = array[count];
                        }
                }

                    
                                int size = (largest - smallest) + 1;
                                int[] newArray = new int[size];
                                 int sum = 0;
                                 for (int counter = smallest; counter <= largest; counter++) {                                 
                                       for (int num = sum; num < size; num ++) {
                                            newArray[num] = counter;
                                     }
                                            sum = sum + 1;
                                }

                        return newArray;

        }

