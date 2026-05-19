import java.util.Arrays;
public class TasksFive {
        public static int[] negativeNumber(int[] array) {
            for (int count = 0; count < array.length; count++) {
                if (array[count] < 0) {
                   array[count] = 0;                
                }
            } 
                return array;
        }

            public static int duplicate(int[] arrays){

            int[] newArray = new int[arrays.length];

                int counter = 0;
                for (int count = 0; count < arrays.length; count++){
                    boolean isDuplicate = false;
                    int occur = 0;
                        for (int num = 0; num < arrays.length; num++) {
                            if(arrays[count] == arrays[num]){
                                occur += 1;            
                            }
                        }
                        if (occur > 1) {
                            newArray[count] = arrays[count];
                                for (int m = 0; m < arrays.length; m++){}
                            isDuplicate = true;
                            counter++;
                        }
                }

                    if (isDuplicate){
                            
                    }
                    return counter;
            }

                public static void main(String[] args) {
                        int[] array = {5 , -9 ,3 , -6 , 2 , -11};
                        int[] arrays = {4 , 6 , 2 , 4 , 7 , 2 , 8 , 2 , 7 , 34 };
                        System.out.println(Arrays.toString(negativeNumber(array)));
                        System.out.println(duplicate(arrays));
                }

}
