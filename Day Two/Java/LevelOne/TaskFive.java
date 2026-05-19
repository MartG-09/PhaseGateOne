import java.util.Scanner;
public class TaskFive{
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);

            System.out.print("Enter celsius :  ");
            int celsius = inputCollector.nextInt();

            int fahrenheit = (celsius * 9/5) + 32;

            System.out.println(fahrenheit);
        }
}
