class ObjectCounter {
        // Static variable to count objects
        private static int count = 0;
        
        // Constructor increments the count
        public ObjectCounter() {
            count++;
        }
        
        // Static method to get the count
        public static int getCount() {
            return count;
        }
        
       
    }
    
public class p6 {
        public static void main(String[] args) {
                // Creating objects
                ObjectCounter obj1 = new ObjectCounter();
                ObjectCounter obj2 = new ObjectCounter();
                ObjectCounter obj3 = new ObjectCounter();
                
                // Displaying the number of objects created
                System.out.println("Number of objects created: " + ObjectCounter.getCount());
            } 
}
