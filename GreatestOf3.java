import java.util.Scanner;

class GreatestOf3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter your 1st number");
        x = scan.nextInt();
        System.out.println("Enter your 2st number");
        y = scan.nextInt();
        System.out.println("Enter your 3st number");
        z = scan.nextInt();
        if(x>y&&x>z){
            System.out.println(x+" is greatest number");
        }
        else if(y>x&&y>z){
            System.out.println(y+" is greatest number");
        }
        else{
            System.out.println(z+" is greatest number");
        }
    }
}
