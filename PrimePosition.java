import java.util.Scanner;

class PrimePosition {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the position of the prime number:");
        int p = scan.nextInt(), count = 0, n = 2;
        while(true){
           int factCount = 0;
            for(int i = 1;i<=n;i++){
                if(n%i==0){
                    factCount += 1;
                }
            }
            if(factCount==2){
                count += 1;
            }
            if(count==p){
                System.out.println(n);
                break;
            }
            n += 1;
        }
        scan.close();
    }
}