import java.util.Scanner;

class FibnocciSeries {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 1, c=a+b;
        System.out.print(a+","+b);
        while(c<=2345){
            System.out.print(","+c);
            a = b;
            b = c;
            c = a+b;
        }
        scan.close();
    }    
}
