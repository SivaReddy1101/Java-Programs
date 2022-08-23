import java.util.Scanner;

public class triangle extends Geometry {
    triangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first side of a triangel: ");
        double a = scan.nextDouble();
        System.out.println("Enter your second side of a triangel: ");
        double b = scan.nextDouble();
        System.out.println("Enter your third side of a triangel: ");
        double c = scan.nextDouble();
        System.out.println("Enter your base of a triangle:");
        double base = scan.nextDouble();
        System.out.println("Enter your height of a triangle:");
        double height = scan.nextDouble();
        calculatePerimeter(a,b,c);
        calculateArea(base,height);
    }

    void calculatePerimeter(double a, double b , double c) {
        double perimeter = a+b+c;
        super.calculatePerimeter(perimeter);
    }
    void calculateArea(double base, double height) {
        double area = (1/2)*(base*height);
        super.calculateArea(area);;
    }
}
