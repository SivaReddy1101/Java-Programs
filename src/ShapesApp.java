import java.util.Scanner;

public class ShapesApp {

    String displayUser(){
        System.out.println("Type 1 to continue or type exit to exit the app: ");
        Scanner scan = new Scanner(System.in);
        String c = scan.next();
        return c;
    }
    public static void main(String[] args) {
        ShapesApp sh = new ShapesApp();
        Geometry geo = null;
        Scanner scan = new Scanner(System.in);
        while(true){
            String x = "1";
            if(x.equals(x)){
                System.out.println("Enter which of the following shape the you want to find the area and perimeter from the given shapes:");
                System.out.println("1.Circle\n2.Rectangle\n3.Triangle\n4.Square\n5.Parallelogram\nType 'exit' to exit the app");
                String str = scan.next().toLowerCase();
                switch(str){
                    case "circle":
                                geo = new circle();
                                x = sh.displayUser();
                                break;
                    case "rectangle":
                                geo = new rectangle();
                                x = sh.displayUser();
                                break;
                    case "square":
                                geo = new square();
                                x = sh.displayUser();
                                break;
                    case "triangle":
                                geo = new triangle();
                                x = sh.displayUser();
                                break;
                    case "parallelogram":
                                geo = new parallelogram();
                                x = sh.displayUser();
                                break;
                    case "exit":
                                System.exit(0);
                    default:
                            System.out.println("You haven,t selected any shape");
                            x = sh.displayUser();
                }
            }
            else if(x.equals("exit")){
                System.exit(0);
            }
        }
    }
}
