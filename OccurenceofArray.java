import java.util.Scanner;

class OccurenceofArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int x = scan.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<x;i++){
            int count = 0;
            for(int j=0;j<x;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" value occurs in an array in "+count+" times");
        }
        scan.close();
    }
}
