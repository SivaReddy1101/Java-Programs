import java.util.Scanner;
class CountEvenOddPrimeArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your array size:");
        int x = scan.nextInt(), count=0, ecount=0, ocount=0;
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = scan.nextInt();
        }
        for(int j:arr){
            int factCount = 0;
            for(int y =1;y<j;y++){
                if(j%y==0){
                    factCount += 1;
                }
            }
            if(factCount == 2){
                count++;
            }
            if(j%2==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("There are "+count+" Prime numbers, "+ecount+" Even numbers and "+ocount+" Odd numbers.");
        scan.close();
    }
}
