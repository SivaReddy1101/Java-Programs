import java.util.Scanner;

public class rectangle extends Geometry {
    
    rectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of a rectangle:");
        double l = scan.nextDouble();
        System.out.println("Enter the width of a rectangle:");
        double  w = scan.nextDouble();
        calculateArea(l,w);
        calculatePerimeter(l,w);
    }

    void calculateArea(double l, double b) {
        double area = l * b;
        super.calculateArea(area);
    }
    void calculatePerimeter(double l, double b) {
        double perimeter = 2* (l + b);
        super.calculateArea(perimeter);
    }
}
