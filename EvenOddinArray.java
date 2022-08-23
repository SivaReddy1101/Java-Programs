import java.util.Scanner;

class EvenOddinArray{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your array size:");
        int x = scan.nextInt();
        int arr[] = new int[x];
        for(int i=0; i<x; i++){
            arr[i] = scan.nextInt();
        }
        for(int j : arr){
            if( j%2==0){
                System.out.println(j+" is a even number in array");
            }
            else{
                System.out.println(j+" is a odd number in array");   
            }
        }
        scan.close();
    }
}