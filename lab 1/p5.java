import java.util.Scanner;
public class p5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character :");
        char c=sc.next().charAt(0);
        if(c=='i'||c=='o'||c=='a'||c=='e'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
        	System.out.println("Entered character is vowale:");
        }
        else{
        	System.out.println("Entered character is constant:");
        }
	}	
}			