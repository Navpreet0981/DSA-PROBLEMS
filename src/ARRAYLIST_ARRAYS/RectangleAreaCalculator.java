package ARRAYLIST_ARRAYS;

import java.util.Scanner; // Import Scanner class from java.util package
public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble(); 

        double area = calculateArea(length, width);
        
        System.out.println("The area of the rectangle is: " + area);
        
        scanner.close(); 
    }
    

    public static double calculateArea(double length, double width) {
        return length * width;
    }
}
