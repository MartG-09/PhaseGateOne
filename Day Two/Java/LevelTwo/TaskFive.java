import java.util.Scanner;
public class TaskFive {
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);
    
            System.out.print("Enter number :  ");
            int number = inputCollector.nextInt();
    s
            System.out.print("Enter number :  ");
            int numberOne = inputCollector.nextInt();
    
            System.out.print("Enter number :  ");
            int numberTwo = inputCollector.nextInt();
                    int largest = number;
                if (largest < numberOne){
                    largest = numberOne;
                }
                    if (largest < numberTwo){
                    largest = numberTwo;
                    }

                System.out.println(largest);
        }
}
