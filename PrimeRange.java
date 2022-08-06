import java.util.Scanner;

class PrimeRange {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the min range:");
        int min = scan.nextInt();
        System.out.println("Enter the max range:");
        int max = scan.nextInt();
        if(min == 1){
            System.out.println("The min range of the prime number is 2");
            min += 1;
        }
        int count = 0, x = min;
        while(x<=max){
            int factCount = 0;
            for(int i = 1; i<=x; i++){
                if(x%i==0){
                    factCount += 1;
                }
            }
            if(factCount == 2){
                System.out.print(x+", ");
            }
            x++;
        }
    }
    
}
