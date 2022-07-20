class MarkSheet {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int f = Integer.parseInt(args[5]);
        int total,avg;
        total = a + b + c + d + e + f;
        avg = total / 6;
        System.out.println("Sum of the given number:"+total);
        System.out.println("Sum of the given number:"+avg);
    }
}
