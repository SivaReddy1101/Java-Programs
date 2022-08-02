import java.util.Scanner;

class AgeGroup1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age = scan.nextInt();
        if(age>0){
            if(age>=13){

                if(age>=20){
                    
                    if(age>=35){

                        if(age>=50){

                            if(age>=120){
                                System.out.println("You are a God");
                            }
                            
                            else{
                                System.out.println("You are a Old man");
                            }
                        }
                        
                        else {
                            System.out.println("You are a Middle age man");
                        }
                    }

                    else{
                        System.out.println("You are a Youngster");
                    }
                }

                else{
                    System.out.println("You are a Teenager");
                }
            }
            else{
                System.out.println("You are a kid");
            }
            
        }
        else{
            System.out.println("The age you have entered is invalid!!!");
        }
    }
}
