class Grade {
    public static void main(String args[]) {
        float m1,m2,m3,m4,m5,m6,total,avg;
        m1 = Float.parseFloat(args[0]);        
        m2 = Float.parseFloat(args[1]);        
        m3 = Float.parseFloat(args[2]);        
        m4 = Float.parseFloat(args[3]);        
        m5 = Float.parseFloat(args[4]);        
        m6 = Float.parseFloat(args[5]);        
        if((m1>=50)&&(m2>=50)&&(m3>=50)&&(m4>=50)&&(m5>=50)&&(m6>=50)){
            total = m1+m2+m3+m4+m5+m6;
            avg = total/6;
            if(avg >= 95){
                System.out.println("Grade O");
            }
            else if(avg >= 90){
                System.out.println("Grade A");
            }
            else if(avg >= 85){
                System.out.println("Grade B");
            }
            else if(avg >= 65){
                System.out.println("Grade C");
            }
            else if(avg >= 50){
                System.out.println("Grade D");
            }
        }
        else {
            System.out.println("Failed F Grade");
        }
        
    }
}
