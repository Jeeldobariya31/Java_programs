import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        String ch = ((a & 1) == 0) ? "even" : "odd";
        System.out.println("The number is " + ch);
    }
}
