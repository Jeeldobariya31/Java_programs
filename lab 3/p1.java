import java.util.Scanner;

public  class p1 {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter sub 1 mark :");
        int a=sc.nextInt();
        System.out.println("Enter sub 2 mark :");
        int b=sc.nextInt();
        System.out.println("Enter sub 3 mark :");
        int c=sc.nextInt();
        System.out.println("Enter sub 4 mark :");
        int d=sc.nextInt();
        System.out.println("Enter sub 5 mark :");
        int e=sc.nextInt();
        int total=a+b+c+d+e;
        double per=total/(5.00);
        System.out.println("Total of all sub mark is "+total);
        System.out.println("Percentage is "+per);
        if(per>=60){
        System.out.println("First division");
    }
    else if(per>=50&&per<=59){
       System.out.println("Second division");
    }
    else if(per>=40&&per<=49){
        System.out.println("Third division");
    }
    else{
        System.out.println("FAIL");

}

    }
 }     