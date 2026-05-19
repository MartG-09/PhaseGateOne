public class Tasks {
        public static int add(int number , int numberOne) {
                return number + numberOne;
        }

            public static boolean isEven(int number) {
                boolean even = false;
                if (number % 2 == 0){
                        even = true;
                }
                return even;
             }   

                 public static int square(int number) {
                      return number * number;
                  }   

                 public static double fahrenheit(int celsius) {
                    double answer = (celsius * 9/5) + 32;
                      return answer;
                  }  

            public static boolean isPrime(int number) {
                boolean even = false;
                for (int count = 2; count <= number/2; count++){
                     if (number % count != 0){
                        even = true;
                    }
                }
                return even;
             }    

                 public static int largestOfThree(int number , int numberOne , int numberTwo) {
                           int largest = number;
                    if(largest < numberOne){
                            largest = numberOne;
                        }
                    if(largest < numberTwo){
                        largest = numberTwo;
                    }
                    return largest;
            }

                 public static double simpleInterest(double principal , double rate , double time) {
                    double interest = (principal * rate * time) / 100;
                      return interest;
                  }  

                 public static int area(int length , int width) {
                      return length * width;
                  }   


            public static int reverseNumber(int number) {  
                        int reverse = 0;
                    while (number > 0){
                        int each = number % 10;
                            reverse = (reverse * 10) + each;
                        number /= 10;
                    }
                          return reverse;
                    }

                    public static void main(String[] args) {
                            System.out.println(add(5 , 6));
                            System.out.println(isEven(3));
                            System.out.println(square(4));
                            System.out.println(fahrenheit(100));
                            System.out.println(isPrime(4));
                            System.out.println(largestOfThree(23 , 17 , 6));
                            System.out.println(simpleInterest(1500 , 50 , 5));
                            System.out.println(area(4 , 5));
                            System.out.println(reverseNumber(12345));
                    }

}










