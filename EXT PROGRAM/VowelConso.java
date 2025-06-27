import java.util.Scanner;
public class VowelConso
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr string");
		String s=sc.nextLine();
		int cav=0,cacs=0,ws=0,v=0,cs=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				cav++;
			}
			else if(c=='i'||c=='o'||c=='a'||c=='e'||c=='u')
			{
               v++;
			}
			else if(c==32)
			{
                ws++;
			}
			else
			{
				if(c>=65&&c<=90)
				{
					cacs++;
				}
				else
				{
                     cs++;
				}
			}
		}
		System.out.println(" small vowel ="+v);
		System.out.println(" capital vowel ="+cav);
		System.out.println(" small consonant ="+cs);
		System.out.println(" capital consonant ="+cacs);
		System.out.println("space ="+ws);
	}
}