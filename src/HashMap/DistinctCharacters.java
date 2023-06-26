package HashMap;
import java.util.HashMap;
import java.util.Map;

public class DistinctCharacters {

        public static void main(String[] args) {
            String input = "test string";

            // Create a HashMap to store characters and their frequencies
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Iterate over the input string
            for (char ch : input.toCharArray()) {
                // Increment the count for each character encountered
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }

            // Print the distinct characters and their counts
            System.out.println("Distinct characters and their counts:");
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                char ch = entry.getKey();
                int count = entry.getValue();
                System.out.println(ch + "-" + count);
            }
        }
    }


