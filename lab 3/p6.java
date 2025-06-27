import java.util.Scanner;

public  class p6 {
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
    if(temp==ans){
        System.out.println("number is pelindrom");
    }
    else{
        System.out.println("number is not pelindrom");
    }
    }
 }      