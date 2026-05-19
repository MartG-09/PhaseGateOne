import java.util.Scanner;
public class TaskFour {
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);
                System.out.print("Enter number :  ");
                    int number = inputCollector.nextInt();

            for (int count = 1; count <= 12; count++) {
                System.out.println(number + " x " + count + " = " + number * count);
            }     
        }
}

