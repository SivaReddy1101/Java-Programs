import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scan.nextLine();
        String arr[] = str.split(" ");
        int x = arr.length;
        x= x-1;
        System.out.println("String words shift position:");
        for(int i=x; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        char arr1[] = new char[str.length()];
        int j= 0;
        for(int i=(str.length() - 1); i>=0; i--){
            arr1[i] = str.charAt(j);
            j++;
        }
        System.out.println(" ");
        System.out.println("Reverse of the entire string: ");
        for (char s : arr1) {
            System.out.print(s);
        }
        scan.close();
    }
}