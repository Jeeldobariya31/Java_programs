
class Example {
        int instanceVar; 
        static int staticVar = 100; 
    
       
        Example(int instanceVar) {
            this.instanceVar = instanceVar;
        }
    
        // Method using 'this' keyword
        void display() {
            System.out.println("Instance Variable: " + this.instanceVar);
            System.out.println("Static Variable using class name: " + Example.staticVar);
        }
    
        // Static method
        static void staticMethod() {
            System.out.println("Static method cannot use 'this'");
        }
    
      
    }
    public class p7 {
        public static void main(String[] args) {
                Example obj = new Example(50);
                obj.display();
                Example.staticMethod();
            }
}
    