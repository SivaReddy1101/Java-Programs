import java.util.Scanner;
public class circle extends Geometry{
    private double pi = 3.14;
    circle(){
        System.out.println("Enter the side of a circle: ");
        Scanner scan = new Scanner(System.in);
        double side = scan.nextDouble();
        calculateArea(side);
        calculatePerimeter(side);
    }
    void calculateArea(double side){
        double area = pi * side * side ;
        super.calculateArea(area);
    }
    void calculatePerimeter(double side){
        double perimeter = 2 * pi * side ;
        super.calculateArea(perimeter);
    }
}
