package week6homework;
import java.util.Scanner;
/**
 * 15. Write a Java program to swap two variables.
 */

public class P15SwapTwoVariables {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input num1: ");
        int a = scanner.nextInt();
        System.out.println("Input num2: ");
        int b = scanner.nextInt();
        System.out.println("before swapping = " + a + ";" + b);
        int ab;
        ab = a;
        a = b;
        b = ab;
        System.out.println("after swapping = " + a + ";" + b);
            scanner.close();


    }
}
