import java.util.Scanner;

public  class NumberReverse{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the int number :");
        int n=sc.nextInt();
         int rim,ans=0,temp;
          temp=n;
         while(n>0)
    {
        rim=n%10;
        ans=(ans*10)+rim;
        n=n/10;
    }
    System.out.println("original number is ="+temp);

    System.out.println("reverse number is ="+ans);

  }
}
