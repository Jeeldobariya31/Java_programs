//stream pattern
import java.util.Scanner;
public class p1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String :");
		String a = sc.nextLine();
		for(int i=0; i<a.length() ; i++){
			int j = 0;
			for( j=0; j<=i; j++){
				char ch = a.charAt(j);
				System.out.print(ch);
			}
			System.out.println();

		}

	}
}