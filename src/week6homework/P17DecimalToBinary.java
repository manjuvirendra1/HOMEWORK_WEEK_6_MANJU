package week6homework;

import java.util.Scanner;
/**
 * 17 Write a Java programme to convert a a decimal into binary number.
 */
public class P17DecimalToBinary {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number to convert into binary: ");
        int a = scan.nextInt();
        System.out.println(Integer.toBinaryString(a));


    }

}
