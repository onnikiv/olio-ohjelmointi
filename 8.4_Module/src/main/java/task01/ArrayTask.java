package task01;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        int[] numbers = {35, 45, 50, 79, 36, 
                         48, 39, 91, 62, 71,
                         93, 30, 66, 79, 80, 
                         46, 34, 28, 57, 42};

        System.out.println("Mean: " + Arrays.stream(numbers)
                            .average()
                            .orElse(0.0));
                            
    }
}
