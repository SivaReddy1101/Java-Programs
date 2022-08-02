import java.util.Scanner;

class Factors {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        int x = scan.nextInt();
        int i=1;
        while(i<=x){
            if(x%i==0){
                System.out.print(i+" ");
            }
            i+=1;
        }
        System.out.println("\nThese are the factors of given number");
    }
}
