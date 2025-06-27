                                                    import java.util.Scanner;

public  class p5 {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the int a :");
        int a=sc.nextInt();
        System.out.println("Enter the int b :");
        int b=sc.nextInt();
        System.out.println("Enter the int c :");
        int c=sc.nextInt();
        if(a>=b&&a>=c){
           System.out.println("the largest int is a="+a);
        }
        else if(b>=a&&b>=c){
           System.out.println(" the largest int is b="+b);
        }
        else{
           System.out.println(" the largest int is c="+c);
        }
    }
 }     