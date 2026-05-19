import java.util.Scanner;
public class TaskSix {
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);
                System.out.print("Enter number :  ");
                    int number = inputCollector.nextInt();
              int num = number;

            for (int count = 1; count < number; count++) {
                num += count;
            }     
                System.out.println(num);

        }
}
