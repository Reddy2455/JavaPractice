package Day14;
import java.util.*;
public class SortingStrings {
        public static void main(String[] args) {
            String[] strings = {"denton", "irving", "frisco", "mckinney"};

            Arrays.stream(strings)
                    .sorted(Comparator.comparingInt(String::length)
                            .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()))
                    .forEach(System.out::println);
        }
    }

