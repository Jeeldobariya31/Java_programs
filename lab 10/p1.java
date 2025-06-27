import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter an int a ");
        int a= sc.nextInt();
        System.out.println("eneter an int b ");
        int b= sc.nextInt();
        int [] c= new int[3];
        System.out.println("make array");
        for (int i = 0; i < c.length; i++) {
            System.out.println("enter int index of "+i+" : ");
            c[i]=sc.nextInt();
         }
         try{
                int ans= a/b;
                System.out.println("ans is " + ans );
         }catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("can no devid by 0");
        }
        try {
            System.out.println("search elemen nof no i  ");
            int se=sc.nextInt();
            System.out.println("Your element is " + c[se]);
        } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("arrayy index is not available , plese enter index 0,1,2");
        }
        
    }    
}
