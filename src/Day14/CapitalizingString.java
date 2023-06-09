package Day14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class CapitalizingString {
    public static void main(String[] args) {
        String[] strings = {"denton", "irving", "frisco", "mckinney"};

        Stream<String> capitalizedStream = Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1));

        capitalizedStream.sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}

