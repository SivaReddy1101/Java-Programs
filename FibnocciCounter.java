import java.util.Scanner;

class FibnocciCounter {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your range:");
        int n = scan.nextInt();
        int a = 0, b = 1, c = a+b, count = 2;
        while(true){
            if(count==n){
                System.out.println("The fibnocci number at the given position is:"+c);
                break;
            }
            count++;
            a = b;
            b = c;
            c = a+b;
        }
        scan.close();
    }
}