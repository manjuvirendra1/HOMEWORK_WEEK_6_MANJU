package week6homework;
import java.util.Scanner;
/**
 *7 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class P7Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a degree in Fahrenheit : ");
        float fahrenheit = input.nextFloat();

        float celsius = ((fahrenheit - 32) * 5/9);
        System.out.println(fahrenheit + " degree fahrenheit is " + celsius + " in celsius");

        input.close();
    }
}
