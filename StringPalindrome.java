import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word/string:");
        String str = scan.nextLine();
        char s[] = new char[str.length()];
        char c[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            s[i] = str.charAt(i);
        }
        int j = 0;
        for (int i = (str.length()-1); i >=0; i--) {
            c[i] = str.charAt(j);
            j++;
        }
        int count =0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]==s[i]){
                count++;
            }
        }
        if(count == str.length()){
            System.out.println("Given string/word is a palindrome.");
        }
        else{
            System.out.println("Given string/word is not a palindrome.");
        }
        scan.close();
    }    
}