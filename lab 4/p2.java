import java.util.Scanner;
public class p2
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
		for(int i=0;i<s;i++)
		{
			sum=sum+arr[i];
		}
		avg=sum/s;
		System.out.println("average ="+avg);
		System.out.println("sum of all element ="+sum);
	}
}