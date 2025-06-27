import java.util.Scanner;

public  class Digitcount{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the int number :");
        int n=sc.nextInt();
         int rim,count=0,temp;
          temp=n;
         while(n>0)
    {
        rim=n%10;
        n=n/10;
        count++;
    }
    System.out.println(" number is ="+temp);
    System.out.println(" digit is ="+count);

  }
}