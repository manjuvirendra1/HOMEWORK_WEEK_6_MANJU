package week6homework;
/**
 * 1 Write a Java programme using the following steps
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class P1CallingInstance {

    int a = 12;
    int b = 14;

    //instance method
    public void myNumbers() {
        System.out.println(a); //calling instance variable into instance method
        System.out.println(b); //calling instance variable into instance method
    }
      //main method
    public static void main(String[] args) {
        P1CallingInstance obj = new P1CallingInstance();// calling instance method into main method
        obj.myNumbers();


    }
}



