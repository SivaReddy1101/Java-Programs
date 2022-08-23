import java.util.Scanner;

public class square extends Geometry{
    square(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of a square: "); 
        double side = scan.nextDouble();
        calculateArea(side);
        calculatePerimeter(side);
    }

    void calculateArea(double side) {
        double area = side * side;
        super.calculateArea(area);
    }
    void calculatePerimeter(double side) {
        double perimeter = 4 * side;
        super.calculatePerimeter(perimeter);
    }
}
