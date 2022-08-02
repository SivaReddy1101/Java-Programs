import java.util.Scanner;

class AgeGroup{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age = scan.nextInt();
        if(age>=120){
            System.out.println("You are a God");
        }
        else if(age>=50){
            System.out.println("You are a Old man");
        }
        else if(age>=35){
            System.out.println("You are a Middle age man");
        }
        else if(age>=20){
            System.out.println("You are a Youngster");
        }
        else if(age>=13){
            System.out.println("You are a Teenager");
        }        
        else if(age>0){
            System.out.println("You are a kid");
        }        
        else{
            System.out.println("The age you have entered is invalid!!!");
        }
    }
}
