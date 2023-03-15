package week6homework;
import java.util.Scanner;
/**
 *8 Write a program to calculate the area of a triangle.
 */
public class P8AreaOfTriangle {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double height = scanner.nextDouble();

        //Area = (width*height)/2
        double area = (base* height)/2;
        System.out.println("Area of Triangle is: " + area);
    }

}
