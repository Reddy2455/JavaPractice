package Day14;
import java.util.*;
import java.util.stream.Stream;

public class Vowels {
        public static void main(String[] args) {
            String[] strings = {"denton", "irving", "frisco", "mckinney"};

            Stream<String> vowelPrinting = Arrays.stream(strings).map(s -> {s.toLowerCase();int vowels=0;for(
                    int i=0;i<s.length();i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
                    vowels++;

            }
                return s+vowels;
            });
            vowelPrinting.sorted().forEach(System.out::println);
        }

    }

