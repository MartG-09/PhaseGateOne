import java.util.Arrays;
public class TwoSum {

        public static int[] checkTwoNumber(int[] array , int number) {

            int[] newArray = new int[2];
            int indexes = 0;
            for (int index = 0; index < array.length; index++) {
            
                boolean twoNumber = false;
                for (int count = index + 1; count < array.length; count++) {
                       if (array[index] + array[count] == number) {
                            newArray[indexes] = array[count];
                            twoNumber = true;
                            break;
                        }
                }

                                  if (twoNumber) {
                                     newArray[indexes + 1] = array[index];
                                    break;
                                }
                     }
                            return newArray;
    
        }
}
