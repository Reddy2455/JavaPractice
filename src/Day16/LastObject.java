package Day16;
import java.util.*;
public class LastObject {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("denton");
            list.add("frisco");
            list.add("plano");

            System.out.println("ArrayList before removal: " + list);

            if (!list.isEmpty()) {
                list.remove(list.size() - 1);
            }

            System.out.println("ArrayList after removal: " + list);
        }
    }


