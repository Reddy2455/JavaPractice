package day9;

public class StringToInteger {

    public static void main(String[] args) throws NumberFormatException {
        String[] s = {"23","45.67","test","123f"};
       for(String input: s)
        try {
            int number = Integer.parseInt(input);
            System.out.println("Value: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Exception occur: " + e.getMessage());
        }
    }
}


