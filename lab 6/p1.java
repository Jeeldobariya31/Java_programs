import java.util.Scanner;
class circle{
    double radius = 0;
    circle(double radius){
        this.radius=radius;
    }
    public double areaOfcircle(){
        double area=Math.PI*radius*radius;
        return area;

    }
}


public class p1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter radius");
          double r= sc.nextDouble();
          circle c1=new circle(r);
          c1.areaOfcircle();
           double area=c1.areaOfcircle();
           System.out.println("area = "+area);
          

    }
}