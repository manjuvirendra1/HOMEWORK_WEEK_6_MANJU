package week6homework;

/**
 * 2 Write a Java programme using following steps
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class P2CallingStatic {

           static int a = 30;
           static int b = 40;


            //static method
          public static void myWork() {

              System.out.println(a);
              System.out.println(b);
          }
            //calling static method into main method
        public static void main(String [] args){

              myWork();

        }


    }


