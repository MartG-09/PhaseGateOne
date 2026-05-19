import java.util.Scanner;
public class TaskTwo {
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);
    
            System.out.print("Enter number :  ");
            int number = inputCollector.nextInt();
            
                if (number >= 0){
                    System.out.println("Positive");
                }
                    else{
                    System.out.println("Negative");
                    }
        }
}
