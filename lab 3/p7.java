import java.util.Scanner;

public class p7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting range:");
        int p = sc.nextInt();

        System.out.println("Enter the last range:");
        int q = sc.nextInt();

            if(p<q)
       {

         for (int j = p; j <= q; j++) 
           {
            int count = 0;


            for (int i = 1; i <= j; i++) 
            {
                if (j % i == 0) 
                {
                    count++;
                }
            }

            
            if (count == 2)
             {
                System.out.println(j);
             }
           }
        }
      
      else
      {

        for (int j = q; j <= p; j++) 
        {
            int count = 0;


            for (int i = 1; i <= j; i++) 
            {
                if (j % i == 0) 
                {
                    count++;
                }
            }

            
            if (count == 2)
             {
                System.out.println(j);
            }
        }
      }
    }
}
