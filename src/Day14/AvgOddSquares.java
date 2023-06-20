package Day14;

import java.util.*;
import java.util.stream.Stream;
public class AvgOddSquares {
        public static void main(String[] args) {
            int []  numbers= {10,11,12,13,14,15};

            float average = (float) Arrays.stream(numbers)
                    .filter(n -> n % 2 != 0)
                    .mapToDouble(n -> Math.pow(n, 2))
                    .average()
                    .orElse(0);

            System.out.println("Average of squares of odd numbers: " + average);
        }
    }

