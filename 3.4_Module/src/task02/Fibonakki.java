package task02;

public class Fibonakki {

    public static void main(String[] args) {
        
        long num1 = 0;
        long num2 = 1;
        long fibo;
        
        for (int i = 0; i <= 60; i++) {
            System.out.println(i + ". " + num1);
            fibo = num1 + num2;
            num1 = num2;
            num2 = fibo;
        }
    }
}
