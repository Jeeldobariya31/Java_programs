import java.util.Scanner;

public  class p2{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("list of total operater in this calculater :");
            System.out.println("1.addition");
            System.out.println("2.subtraction");
            System.out.println("3.multiplication");
            System.out.println("4.division");
            System.out.println("Enter the operater name as per above descreption ");
            String s=sc.nextLine();
            System.out.println("Enter the number a :");
            double a=sc.nextDouble();
            System.out.println("Enter the number b :");
            double b=sc.nextDouble();

            if(s.equals("addition")){
             System.out.println("addition is = "+(a+b));
            }
            else if(s.equals("subtraction")){
             System.out.println("subtraction is = "+(a-b));
            }
            else if(s.equals("multiplication")){
             System.out.println("multiplication is = "+(a*b));
            }
            else if(s.equals("division")){
             System.out.println("division is = "+(a/b));
            }
            else{
                System.out.println("invalied input");
            }
    }
 }           