import java.util.Scanner;
public class p4{
	public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in meter :");
        double meter=sc.nextDouble();
        double feet=meter* 3.28084;
        System.out.println("feet is = "+feet);
	}
}