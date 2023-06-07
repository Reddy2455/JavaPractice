package day6;

public class Fibonacci {
        public static void main (String args[]) {
            int n=10;
            int firstTerm=0;
            int secondTerm=1;
            int temp=0;
            System.out.println(+firstTerm);
            for(int i=1;i<n;i++) {
                temp=firstTerm+secondTerm;
                firstTerm=secondTerm;
                secondTerm=temp;
                System.out.println(""+firstTerm);

            }
        }

    }

