package day9;

public class CustomException {
    public static void main(String[] args) {
        int f1 = 6;
        int s1 = 0;
        try {
            int result = f1 / s1;

        } catch (ArithmeticException ae) {
            try {
                throwCustomException(ae);
            } catch (CustomExceptionExample e) {
                System.out.println("exception: " + e.getMessage());
                ae.printStackTrace();
            }


        }
    }

    public static void throwCustomException(ArithmeticException ae) throws CustomExceptionExample {

        throw new CustomExceptionExample("" + ae.getMessage());
    }
}






