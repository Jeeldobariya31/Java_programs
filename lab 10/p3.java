import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an int num \"num 1\"");
        double num1=sc.nextInt();
        System.out.println("Enter an int num \"num 2\"");
        double num2=sc.nextInt();

        try {     if(num2!=0){
                double ans=(num1)/num2; 
                System.out.println("Ans is "+ans);  
            }
            else{
                 throw  new Exception("can not divided by 0");
            }
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }    
}
