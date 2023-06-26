package HashMap;
import java.util.HashMap;
import java.util.Map;

    class Student {
        private String firstName;
        private String lastName;
        private double GPA;

        public Student(String firstName, String lastName, double GPA) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.GPA = GPA;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGPA() {
            return GPA;
        }
    }



