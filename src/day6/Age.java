package day6;
import java.util.*;
public class Age {

        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter age:");
            int age=sc.nextInt();
            if((age>=12)&&(age<=19)) {
                System.out.println("TEEN");
            }
            else if (age<12) {
                System.out.println("KID");
            }
            else if(age>19) {
                System.out.println("ADULT");
            }

        }

    }

