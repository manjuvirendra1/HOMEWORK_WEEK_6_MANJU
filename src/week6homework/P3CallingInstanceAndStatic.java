package week6homework;

/**
 * 3 Write a Java programme using the following steps
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
//Instance and static variables
public class P3CallingInstanceAndStatic {
         //instance variable
        String a = "myCity";
         //static variable
        static String b = " myName";

    //instance method
    public void myCity() {
        P3CallingInstanceAndStatic obj = new P3CallingInstanceAndStatic();
        System.out.println(a);
        System.out.println(obj.b);
    }
    //static method
    public static void myName(){
        P3CallingInstanceAndStatic obj = new P3CallingInstanceAndStatic();
        System.out.println(obj.a);
        System.out.println(b);
    }
    //calling instance and static method into main method
    public static void main(String [] args){
            P3CallingInstanceAndStatic obj = new P3CallingInstanceAndStatic();
            obj.myCity();
            myName();

        }

    }
