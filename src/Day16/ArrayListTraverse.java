package Day16;
import java.util.*;
public class ArrayListTraverse {
        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();
            stringList.add("denton");
            stringList.add("frisco");
            stringList.add("plano");
            stringList.add("irving");

            //  for loop
            System.out.println("Traverse using for loop:");
            for (int i = 0; i < stringList.size(); i++) {
                String element = stringList.get(i);
                System.out.println(element);
            }
            System.out.println();

            // enhanced for loop
            System.out.println("Traverse using enhanced for loop:");
            for (String element : stringList) {
                System.out.println(element);
            }
            System.out.println();

            // forEach
            System.out.println("Traverse using forEach:");
            stringList.forEach(System.out::println);
            System.out.println();

            // iterator
            System.out.println("Traverse using iterator:");
            Iterator<String> iterator = stringList.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }
            System.out.println();

            // parallel stream
            System.out.println("Traverse using parallel stream:");
            stringList.parallelStream().forEach(System.out::println);
        }
    }

