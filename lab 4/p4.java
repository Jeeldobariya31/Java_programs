import java.util.Scanner;
public class p4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr string");
		String s=sc.nextLine();
		int len=s.length();
		System.out.println("length of string is "+len);
		System.out.println("half string");
		for(int i=len/2;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.println(ch);
		}
		
	}
}