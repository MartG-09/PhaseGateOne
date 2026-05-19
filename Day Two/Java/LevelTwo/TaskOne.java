import java.util.Scanner;
public class TaskOne {
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);
    
            System.out.print("Enter number :  ");
            int number = inputCollector.nextInt();
            
                if (number % 2 == 0){
                    System.out.println("Even");
                }
                    else{
                    System.out.println("Odd");
                    }
        }
}
