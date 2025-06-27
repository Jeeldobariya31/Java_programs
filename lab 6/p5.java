class Complex {
        private double real;
        private double imag;
    
        // Default constructor
        public Complex() {
            this.real = 0;
            this.imag = 0;
        }
    
        // Parameterized constructor
        public Complex(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }
    
        // Method to add two complex numbers
        public Complex add(Complex other) {
            return new Complex(this.real + other.real, this.imag + other.imag);
        }
    
        // Method to display the complex number
        public void display() {
            System.out.println(this.real + " + " + this.imag + "i");
        }
    
        
    }
    
public class p5 {
        public static void main(String[] args) {
                Complex c1 = new Complex(3, 4);
                Complex c2 = new Complex(1, 2);
        
                Complex sum = c1.add(c2);
                System.out.print("Sum: ");
                sum.display();
            }
}
