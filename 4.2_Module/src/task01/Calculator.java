package task01;


public class Calculator {
    private int sum;

    public Calculator() {
        this.sum = 0;
    }


    public void add(int number) {
        if (number >= 0) {
            sum += number;
        } else {
         System.out.println("ähäkutti");   
        }
    }

    public double getCurrent() {
        return sum;
    }

    public void reset() {
        sum = 0;
    }

}
