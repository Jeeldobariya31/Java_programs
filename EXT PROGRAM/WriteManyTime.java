import java.util.Scanner;
public class WriteManyTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string which you repet");
        String str = sc.nextLine();
        System.out.println("enter  number of time string which you repet");
        int  number = sc.nextInt();
        
        // Loop to print  times 
        for (int i = 1; i <=number; i++) {
            System.out.println(i+"."+str);
        }
    }
}
