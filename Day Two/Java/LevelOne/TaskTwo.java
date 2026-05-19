import java.util.Scanner;
public class TaskTwo{
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);

            System.out.print("Enter age :  ");
            int age = inputCollector.nextInt();

            System.out.println("You wiill be " + (age + 5 ) + " in five years");
        }
}
