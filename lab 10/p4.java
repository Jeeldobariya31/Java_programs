import  java.util.Scanner;
public class p4 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter int nuber ehich range of 10 ton 50");
            int num=sc.nextInt();
            try{
            if(num<10||num>50){
                throw new Exception("Number not in Range");
            }
            else{
                int square=num*num;
                System.out.println("given number Square is "+square);
            }}
            catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

}
