import java.util.Random;
import java.util.Scanner;
public class NumberGuessingApp {
    public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);
            Random rand = new Random();
            int rightNumber = rand.nextInt(1 , 100);
        
            int num = 0;
//        for (int count = 1; count <= 1; count++){
            System.out.print("Guess your number :  ");
            int number = inputCollector.nextInt();

                if (number > 0){
                  if (number < 101) {
                    if (number == rightNumber) {
                        num++;
                      System.out.println(rightNumber);
                    }
                    else {
                         for (int counter = 1; counter <= 5; counter++)    {
                            if (number > rightNumber){
                                    System.out.println("It's too high!!'");
                            }
                            else{
                                    System.out.println("It's too low!!'");
                            }
                            System.out.print("Guess your number :  ");
                                number = inputCollector.nextInt();
                                if (number == rightNumber) {
                                   System.out.println(rightNumber);
                                    num++;
                                     break;
                               }
                                }
                            }       
                        }

                }
                else{
                            System.out.println("Wrong input!!! , input number within range 1 to 100");                  
                    }
                                   System.out.println(rightNumber);
//        }
    }
}
