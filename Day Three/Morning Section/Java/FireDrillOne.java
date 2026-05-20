public class FireDrillOne {
        public static String displayTest(String[] array) {
                String text = "no one likes this";
   
                    if (array.length == 0) {
                        text = text;
                    }
                for (int count = 0; count < array.length; count++) {
                       if (array.length == 1) {
                            text = array[0] + " likes this";
                        }
                    
                                    else if (array.length == 2) {
                            text = array[0] + " and " + array[1] +" likes this";
                                      }
                    
                                    else if (array.length == 3) {
                            text = array[0] + ", " + array[1] + " and " + array[2] +" likes this";
                                      }

                    
                                    else if (array.length > 3) {
                                        int others = array.length - 2;
                                        text = array[0] + ", " + array[1] + " and " + others +" others likes this";
                                 }


                }

                    return text;
        }

                                public static void main(String[] args) {
                                      String[] array = {"Alex" , "Jacob" , "Mark" , "Max" , "Jide" , "David"};
                                        System.out.println(displayTest(array));
                                }

}
