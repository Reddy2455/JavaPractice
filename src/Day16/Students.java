package Day16;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Students {
        private String firstName;
        private String lastName;
        private double gpa;

        public Students(String firstName, String lastName, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " (GPA: " + gpa + ")";
        }
    }

     class StudentRemoval {
        public static void main(String[] args) {
            List<Students> studentsList = new ArrayList<>();
            studentsList.add(new Students("vishal", "cis", 3.3));
            studentsList.add(new Students("vivek", "cis", 3.4));
            studentsList.add(new Students("kranthi", "cis", 3.5));
            studentsList.add(new Students("sushmitha", "cis", 3.7));


            double totalGpa = 0;
            for (Students student : studentsList) {
                totalGpa += student.getGpa();
            }
            double averageGpa = totalGpa / studentsList.size();

            System.out.println("Average GPA: " + averageGpa);
            System.out.println("Students before removal: " + studentsList);

            Iterator<Students> iterator = studentsList.iterator();
            while (iterator.hasNext()) {
                Students student = iterator.next();
                if (student.getGpa() < averageGpa) {
                    iterator.remove();
                }
            }
            System.out.println("Students after removal: " + studentsList);
        }
    }

