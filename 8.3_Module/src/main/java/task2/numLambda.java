package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface Calculator {

    int add(int sum, int toAdd);
    
}

public class numLambda {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15, 3, 12));
        
        
        Consumer<Integer> evenNumbers = num -> {
            if (num % 2 == 0) {
                System.out.print(num + ", ");
            }
        };

        Consumer<Integer> oddNumbers = num -> {
            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }
        };

        System.out.println("\nAlkuperäiset luvut: ");
        System.out.println(numbers);

        System.out.println("\nParilliset luvut: ");
        numbers.forEach(evenNumbers);
        
        System.out.println("\n\nParittomat luvut: ");
        numbers.forEach(oddNumbers);

        System.out.println("\n\nTuplataan parittomat luvut ->");
        numbers.replaceAll(num -> (num % 2 != 0 ? num * 2: num));

        System.out.println("\nKaikki luvut nyt: ");
        System.out.println(numbers);

        int sum = 0;
        Calculator calc = (a, b) -> a + b;

        for (int num : numbers) {
            sum = calc.add(sum, num);
        }

        System.out.println("\nSumma: " + sum);
    }
}
