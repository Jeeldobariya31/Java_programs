class MessagePrinter implements Runnable {
        private String message;
        private int interval;
    
        public MessagePrinter(String message, int interval) {
            this.message = message;
            this.interval = interval;
        }
    
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(message);
                    Thread.sleep(interval);
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
    
    public class p2 {
        public static void main(String[] args) {
            Thread morningThread = new Thread(new MessagePrinter("Good Morning", 1000));
            Thread afternoonThread = new Thread(new MessagePrinter("Good Afternoon", 3000));
            
            morningThread.start();
            afternoonThread.start();
        }
    }
    