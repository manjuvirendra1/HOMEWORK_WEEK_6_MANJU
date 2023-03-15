package week6homework;

import java.util.Scanner;

/**
 *18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 */
public class P18RemainderOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1 = ");
        int a = scanner.nextInt();
        System.out.println("Input number 2 = ");
         int b = scanner.nextInt();
        System.out.println("125 + 24 = " + (a+b));
        System.out.println("125 - 24 = " + (a-b));
        System.out.println("125 * 24 = " + (a*b));
        System.out.println("125 / 24 = " + (a/b));
        System.out.println("125 mod 24 = " + (a%b));

           scanner.close();
    }
}
