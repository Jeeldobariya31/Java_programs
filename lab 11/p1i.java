
class MyThread extends Thread {
        private String threadName;
        
        public MyThread(String name) {
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
    
    public class p1i {
        public static void main(String[] args) {
            // Creating thread instances
            MyThread thread1 = new MyThread("Thread 1");
            MyThread thread2 = new MyThread("Thread 2");
            
            // Starting the threads
            thread1.start();
            thread2.start();
        }
    }
