public class Geometry {
    double side,length,bredth,height;
    
    Geometry(double side){
        this.side = side;
    }

    void calculateArea(double area){
        System.out.println("The area of the "+this.getClass()+" is: "+area);
    }
    void calculatePerimeter(double perimeter){
        System.out.println("The perimeter of the "+this.getClass()+" is: "+perimeter);
    }
}