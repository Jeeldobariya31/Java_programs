import java.util.Scanner;
public class p1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr string");
		String s=sc.nextLine();
		int v=0,cs=0,ws=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='i'||c=='o'||c=='a'||c=='e'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				v++;
			}
			else if(c==32)
			{
                ws++;
			}
			else{
				cs++;
			}
		}
		System.out.println("vowel ="+v);
		System.out.println("consonant ="+cs);
		System.out.println("space ="+ws);
	}
}