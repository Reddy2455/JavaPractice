package Day12;
    public class NumberPrintRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            NumberPrintRunnable numberPrintingRunnable = new NumberPrintRunnable();
            Thread thread = new Thread(numberPrintingRunnable);
            thread.start();
        }
    }


