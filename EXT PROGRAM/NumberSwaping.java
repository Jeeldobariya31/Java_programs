import java.util.Scanner;

public  class NumberSwaping{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=sc.nextInt();
         System.out.println("Enter the second  number :");
        int b=sc.nextInt();
        int temp1=a;
        int temp2=b;

        a=a*b;
        b=a/b;
        a=a/b;

         System.out.println(" before swaping");
          System.out.println(" the first number :"+temp1);
           System.out.println(" the second number :"+temp2);
            System.out.println("after swaping:");
             System.out.println(" the first number :"+a);
              System.out.println("the second number :"+b);
         

  }
}