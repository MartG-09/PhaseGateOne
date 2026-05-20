import java.util.Scanner;
import java.util.Arrays;
public class ParkingSlot {
        public static int checkForFreeSlot(int[] array) {
            int slot = 0;
                for (int count = 0; count < array.length; count++) {
                        if (array[count] == 0) {
                                slot++;
                        }
                }
                    return slot;
        }
            public static String printCheckForFreeSlot(int[] array) {
                int slot = checkForFreeSlot(array);
                  String check = "20 slot taken , No slot left";
                if (slot != 0) {
                    int remain = array.length - slot;
                    check = remain + " slot taken , there are " + slot + " Left";
                }

                    return check;
            }

                                public static int[] enterParkLot(int[] array) {
                                    Scanner inputCollector = new Scanner(System.in);
                                        if (checkForFreeSlot(array) > 0) {
                                            System.out.print("Enter car number (- 1 to stop):  ");
                                                int carNumber = inputCollector.nextInt();

                                            while (carNumber != -1) {
                                                boolean num = false;

                                          for (int count = 0; count < array.length; count++){
                                                if (array[count] == 0) {    
                                                        num = true;                    
                                                   array[count] = carNumber;
                                                        break;
                                                    }

                                            }
                                           if (!num)  break;

                                            System.out.print("Enter car number (- 1 to stop):  ");
                                               carNumber = inputCollector.nextInt();
                                      }
                              }

                                                return array;

                                }

                                    public static void main(String[] args) {
                                            int[] array = {1 , 0 , 3 , 9 , 0};
                                            System.out.println(checkForFreeSlot(array));
                                            System.out.println(printCheckForFreeSlot(array));
                                            System.out.println(Arrays.toString(enterParkLot(array)));
                                    }






















}
