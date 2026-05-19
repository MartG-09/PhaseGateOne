import java.util.Scanner;
public class TaskNine{
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);

            System.out.print("Enter item :  ");
            int item = inputCollector.nextInt();

            double tax = item * 0.1;
            System.out.println((tax + item));
        }
}
