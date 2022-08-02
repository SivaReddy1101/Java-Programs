import java.util.Scanner;
class Multiplication{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for multiplication:");
        int x = scan.nextInt();
        int multi, i = 1;
        while(i<=20){
            multi = i * x;
            System.out.println(x+ "x" +i+ "="+ multi);
            i++;
        }
    }
}