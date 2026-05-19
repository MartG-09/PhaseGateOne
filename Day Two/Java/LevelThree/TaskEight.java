import java.util.Scanner;
public class TaskEight{
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);

                System.out.print("Enter number :  ");
                    int number = inputCollector.nextInt();

                  int sum = 0;

            while (number != 0) {

                sum += number;

                System.out.print("Enter number :  ");
                  number = inputCollector.nextInt();
            }     
                System.out.println(sum);

        }
}
