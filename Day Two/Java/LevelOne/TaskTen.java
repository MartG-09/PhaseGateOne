import java.util.Scanner;
public class TaskTen{
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);

            System.out.print("Enter number :  ");
            int numberOne = inputCollector.nextInt();

            System.out.print("Enter number :  ");
            int numberTwo = inputCollector.nextInt();

            System.out.print("Enter number :  ");
            int numberThree = inputCollector.nextInt();


            int sum = numberOne + numberTwo + numberThree;
            double average = sum / 3.0;
            System.out.printf("%.2f%n" , average);
        }
}
