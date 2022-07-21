class Discount {
    public static void main(String args[]){
        float discount,originalPay = Float.parseFloat(args[0]),finalPay;
        if(originalPay >= 50000){
            discount = originalPay * 0.3f;
            finalPay = originalPay - discount;
            System.out.println("The final amount after discount is :"+finalPay);
        }
        else if(originalPay >= 30000){
            discount = originalPay * 0.15f;
            finalPay = originalPay - discount;
            System.out.println("The final amount after discount is :"+finalPay);
        }
        else if(originalPay >= 15000){
            discount = originalPay * 0.08f;
            finalPay = originalPay - discount;
            System.out.println("The final amount after discount is :"+finalPay);
        }
        else if(originalPay >= 5000){
            discount = originalPay * 0.05f;
            finalPay = originalPay - discount;
            System.out.println("The final amount after discount is :"+finalPay);
        }
        else if(originalPay >= 1){
            System.out.println("There is no discount below 5000 :"+originalPay);
        }
    }
}
