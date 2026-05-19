import java.util.Scanner;
public class TaskThree{
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);

            System.out.print("Enter number :  ");
            int numberOne = inputCollector.nextInt();

            System.out.print("Enter number :  ");
            int numberTwo = inputCollector.nextInt();

            int sum = numberOne + numberTwo;
            System.out.println(sum);
        }
}
