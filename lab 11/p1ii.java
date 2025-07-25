

class MyRunnable implements Runnable {
        private String threadName;
        
        public MyRunnable(String name) {
            this.threadName = name;
        }
        
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Count: " + i);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    System.out.println(threadName + " interrupted.");
                }
            }
            System.out.println(threadName + " has finished execution.");
        }
    }
    
    public class p1ii {
        public static void main(String[] args) {
            
            Thread thread1 = new Thread(new MyRunnable("Thread 1"));
            Thread thread2 = new Thread(new MyRunnable("Thread 2"));
            
            
            thread1.start();
            thread2.start();
        }
    }
    
