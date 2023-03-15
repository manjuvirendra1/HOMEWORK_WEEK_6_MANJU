package week6homework;
/**
 * 4 Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class P4CallingBothTwice {
    //4.1 instance variables
    int a = 20;
    int b = 30;


    //static variables

    static int c = 40;
    static int d = 50;

    public void myNumbers() {//4.2 instance variable

        System.out.println(a);//4.4 instance variable
        System.out.println(b);//4.4 instance variable

        System.out.println(P4CallingBothTwice.c);//4.4 static variable
        System.out.println(P4CallingBothTwice.d);//4.4 static variable
    }
    public static void myWork() {//4.3 static method
        P4CallingBothTwice obj = new P4CallingBothTwice();
        System.out.println(obj.a);//4.4 instance variable
        System.out.println(obj.b);//4.4 instance variable

        System.out.println(c);//4.4 static variable
        System.out.println(d);//4.4 static variable//
    }

    public static void main(String[] args) {//4.5 main method
        P4CallingBothTwice obj = new P4CallingBothTwice();
        obj.myNumbers();//4.6 instance method
        myWork(); //4.6 static method

    }
}
