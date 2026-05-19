import java.util.Scanner;
public class TaskTen{
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);

                System.out.print("Enter number :  ");
                    int number = inputCollector.nextInt();

                int count = 0;
            while (number > 0) {
                int each = number % 10;
                number /= 10;

                    count++;
            }     
                System.out.println(count);

        }
}
