package Day12;

public class NumberPrintThread extends Thread {

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            NumberPrintThread thread = new NumberPrintThread();
            thread.start();
        }
    }


