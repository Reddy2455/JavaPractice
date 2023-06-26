package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

        public static void main(String[] args) {
            // Create HashMap of students
            HashMap<String, Student> studentMap = new HashMap<>();

            // Add students to the HashMap
            studentMap.put("vishal", new Student("Vishal", "Bangari", 3.8));
            studentMap.put("rohith", new Student("rohith", "Ss", 4.0));
            studentMap.put("vamsi", new Student("Vamsi", "Narra", 3.5));
            studentMap.put("phani", new Student("Phani", "Javva", 3.9));

            // Print the HashMap
            for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
                String key = entry.getKey();
                Student student = entry.getValue();
                System.out.println("Key: " + key + ", Value: " + student.getFirstName() + " " + student.getLastName() + " (GPA: " + student.getGPA() + ")");
            }
        }
    }

