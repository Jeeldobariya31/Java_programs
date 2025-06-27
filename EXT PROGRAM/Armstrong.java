import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int number:");
        int n = sc.nextInt();
        int rim = 0, ans = 0, temp, count = 0;
        temp = n;
        // Count the number of digits
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        temp = n;

        while (temp > 0) 
        {
            rim = temp % 10;
            
            int multiply = 1;

            for (int i = 1; i <= count; i++) 
            {
                multiply = multiply * rim;
            }

            ans = ans + multiply;
            temp = temp / 10;
        }

        if (ans == n) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}
