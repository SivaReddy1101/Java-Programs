import java.util.Scanner;
class Factor {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x,y,fact;
        System.out.println("Enter x Value");
        x = scan.nextInt();
        System.out.println("Enter y Value");
        y= scan.nextInt();
        fact=(x%y==0)? y:x;
        System.out.println(fact+"fact value of "+x);
    
    }
}
