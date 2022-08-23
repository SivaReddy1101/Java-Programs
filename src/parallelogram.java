import java.util.Scanner;

public class parallelogram extends Geometry {
    parallelogram(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of a parallelogram: ");
        double side = scan.nextDouble();
        System.out.println("Enter the base of the parallelogram: ");
        double base = scan.nextDouble();
        System.out.println("Enter the height of the parallelogram: ");
        double height = scan.nextDouble();
        calculateArea(base,height);
        calculatePerimeter(side, base);
    }

    void calculateArea(double base, double height) {
        double area = base * height;
        super.calculateArea(area);
    }
    void calculatePerimeter(double side, double base) {
        double perimeter = 2 * (base * side);
        super.calculatePerimeter(perimeter);
    }
}
