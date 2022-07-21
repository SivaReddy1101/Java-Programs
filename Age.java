class Age{
    public static void main(String  args[]){
        int age = Integer.parseInt(args[0]);
        if(age >= 120){
            System.out.println("You might be god.");
        }
        else if(age >= 50){
            System.out.println("You are a old man");
        }
        else if(age >= 35){
            System.out.println("You are middle age man.");
        }
        else if(age >= 20){
            System.out.println("You are youth");
        }
        else if(age >= 13){
            System.out.println("You are a teenager");
        }
        else if(age >= 1){
            System.out.println("You are a kid.");
        }
    }
}