package Day16;
import java.util.*;

public class ArrayListToArray {
        public static void main(String[] args) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("denton");
            arrayList.add("plano");
            arrayList.add("frisco");

            String[] array = arrayList.toArray(new String[0]);

            System.out.println("ArrayList: " + arrayList);
            System.out.print("Array: ");
            for (String element : array) {
                System.out.print(element + " ");
            }
        }
    }

