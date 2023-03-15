package week6homework;
import java.util.Scanner;
/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.6 Height = 8.5
 */
public class P14AreaAndPerimeterRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Width = ");
        double w = scanner.nextDouble();
        System.out.println("Input Height = ");
        double h = scanner.nextDouble();
        System.out.println("Area is = " + w * h);
       System.out.println("Perimeter is = " + 2 * (w + h));
           scanner.close();
    }
}
