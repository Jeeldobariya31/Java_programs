import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("The number is not prime.");
            return;
            
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++)
         {
            if (n % i == 0) 
            {
              System.out.println("The number is not prime.");
                return;
            }
            
        }
         System.out.println("The number is prime.");

    }
}
