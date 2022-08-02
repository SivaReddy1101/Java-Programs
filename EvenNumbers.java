import java.util.Scanner;

class EvenNumbers {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number1:");
        int x = scan.nextInt();
        System.out.println("Enter your number2:");
        int y = scan.nextInt();
        while(x<=y){
            if(x%2==0){
                System.out.print(x+ " ");
            }
            x+=1;
        }
    }
}
