package week6homework;

import java.util.Scanner;

/**
 * 16 Write a Java program to add two binary numbers.
 * Input first binary number: 10
 * Input second binary number: 11
 */
public class P16BinaryNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1st Binary number: ");
        String a = scan.next();
        System.out.println("Please enter 2nd Binary number: ");
        String b = scan.next();
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);
        int n3 = n1 + n2;
        System.out.println("a = " + Integer.toBinaryString(n1));
        System.out.println("b = " + Integer.toBinaryString(n2));

        System.out.println("n3 = a + b: " + Integer.toBinaryString(n3));

        scan.close();
    }


}





