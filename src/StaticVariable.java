public class StaticVariable {
    private static int age;

    public static int staticMethod() {
        return 1234;
    }

    static {
        age = staticMethod();
    }

    public static int getStaticValue(){
        return age;
    };
    public static void main(String[] args) {
        int value = StaticVariable.getStaticValue();
        System.out.println("Static variable value is: " + value);
    }
}
