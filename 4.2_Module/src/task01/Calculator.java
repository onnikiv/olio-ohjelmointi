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

    // alustin metodin public void powerOf(int exponent),
    // ja kuiskasin Copilotille " Finish this method. "
    public void powerOf(int exponent) {
        sum = (int) Math.pow(sum, exponent);
    }

    public void getAllEvenNumbers() {
        for (int i = 0; i <= sum; i++) {
            // alustettu metodi ja looppi
            // "Iterate through the sum and print all of the numbers
            // that are even."
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // "Make me a method that uses a while loop, which prints all the Odd numbers, 
    //  + add empty spaces between numbers"
    public void printAllOddNumbers() {
        int i = 0;
        while (i <= sum) {
            if (i % 2 != 0) {
                System.out.print(" " + i + " ");
            }
            i++;
        }
    }
}
