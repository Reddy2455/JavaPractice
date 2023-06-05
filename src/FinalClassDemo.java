public class FinalClassDemo {
        protected final int finalVariable = 40;

       protected final void finalMethod() {
            System.out.println("This is the final method.");
        }
        public static void main(String[] args) {
            FinalClassDemo finalOutput = new FinalClassDemo();
            System.out.println("Final variable: " + finalOutput.finalVariable);
            finalOutput.finalMethod();
        }
    }

