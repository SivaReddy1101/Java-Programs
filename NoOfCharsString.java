import java.util.Scanner;
public class NoOfCharsString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scan.nextLine();
        int totalLength = str.length();
        String arr[] = str.split(" ");
        System.out.println("Total number of words in a string: "+arr.length);
        System.out.println("Total number of chars in a string: "+totalLength);
        scan.close();
    }    
}