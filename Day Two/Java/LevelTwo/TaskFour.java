import java.util.Scanner;
public class TaskFour {
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);
    
            System.out.print("Enter number :  ");
            int number = inputCollector.nextInt();
    
            System.out.print("Enter number :  ");
            int numberOne = inputCollector.nextInt();
                    int largest = 0;
                if (number > numberOne){
                    largest = number;
                }
                    else{
                    largest = numberOne;
                    }

                System.out.println(largest);
        }
}
