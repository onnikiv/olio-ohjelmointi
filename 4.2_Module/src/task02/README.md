### Task 2

Käskystä tehty ```Calculator```-luokka, jossa on muutama alkeellinen metodi. Tämän dokumentin alapäässä selitykset...
#### Metodit: 
```
add() 
getCurrent()
reset()
powerOf(int exponent)
getAllEvenNumbers()
printAllOddNumbers()
```
#### ```Calculator```-luokka

```java
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

    public void powerOf(int exponent) {
        sum = (int) Math.pow(sum, exponent);
    }

    public void getAllEvenNumbers() {
        for (int i = 0; i <= sum; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

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
```
"Explain this code"
### Summary   
The Calculator class provides basic arithmetic operations like addition and exponentiation, as well as methods to print even and odd numbers up to the current sum. It also includes a method to reset the sum and retrieve the current sum value. The class is designed to handle non-negative integers for addition and provides playful feedback for negative inputs.