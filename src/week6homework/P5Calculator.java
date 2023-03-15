package week6homework;

/**
 * 5 Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class P5Calculator {
    public static void main(String[] args) {
        System.out.println();
        P5Calculator obj = new P5Calculator();
        obj.addition();
        obj.subtraction();
        multiplication();
        division();
    }
    public void addition(){
        int a = 5;
        int b = 6;
        int ans = a + b;
        System.out.println("Addition of two number is :" + ans);

    }
    public void subtraction(){
        int a = 24;
        int b = 12;
        int ans = a- b;
        System.out.println("Subtraction of two numbers is :" + ans);
    }
    public static void multiplication(){
        int a = 5;
        int b = 5;
        int ans = a * b;
        System.out.println("Multiplication of two numbers is :" + ans);

    }
    public static void division(){
        int a = 80;
        int b = 20;
        int ans = a/b;
        System.out.println("Division of two numbers is :" + ans);
    }

}
