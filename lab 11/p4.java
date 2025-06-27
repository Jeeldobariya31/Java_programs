class OddPrinter implements Runnable {
        @Override
        public void run() {
                int i=1;
            while (true) {

                if (i % 2 != 0) {
                    System.out.println("Odd: " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                i++;
            }
        }
    }
    
    class EvenPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even: " + i);
                    try {
                        Thread.sleep(100); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    
public class p4 {

        public static void main(String[] args) {
            Thread oddThread = new Thread(new OddPrinter());
            Thread evenThread = new Thread(new EvenPrinter());
    
            oddThread.start();
            evenThread.start();
        }
    }
    
    