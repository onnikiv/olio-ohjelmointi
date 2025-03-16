package task02;

import java.util.Arrays;
import java.util.List;

public class FilterTask {
    public static void main(String[] args) {
        List<Integer> numbers
        = Arrays.asList(11, 22, 33, 44,
                             55, 66, 77, 88,
                             20, 30, 99, 100);

        System.out.println(
            numbers.stream()
            .filter(number -> number % 2 != 0)
            .mapToInt(number -> number * 2)
            .sum()

        );                     
    }

}
