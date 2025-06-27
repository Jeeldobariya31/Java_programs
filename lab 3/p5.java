import java.util.Scanner;

public  class p5 {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year number :");
        int year=sc.nextInt();
        int i;
        if(year%4==0)
     {
      if(year%100==0){
        if(year%400==0){
          i=1;
        }
        else{
          i=2;
        }
      }
      else{
         i=1;
      }
     }
     else
     {
        i=2;
     }
     if(i==1){
        System.out.println("Enterd year is leap year");
     }
     else{
       System.out.println("Enterd year is comon year"); 
     }
    }
 }           