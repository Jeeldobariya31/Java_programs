import java.util.Scanner;
public class p3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr no of element");
		int s=sc.nextInt();
		int [] arr=new int[s];
		double sum=0,avg=0;
		for(int i=0;i<s;i++)
		{
			System.out.println("Enetr element no "+(i+1)+" :");
		     arr[i]=sc.nextInt();
		}
		System.out.println(" originl array");
		for(int i=0;i<s;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(" reversed array");
		for(int i=s-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
}