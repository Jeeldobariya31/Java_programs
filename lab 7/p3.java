import java.util.Scanner;
class Parent{
	int a;
	Parent(int a){
		this.a  = a;
	}
	public void display(){
		System.out.println("Parent ="+a);
	}
}
class Child extends Parent{
	int b;
	Child(int a,int b){
		super(a);
		this.b = b;
	} 
	public void display(){
		super.display();
		System.out.println("Child ="+b);
	}
}
public class p3{
	public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
		Child c1 = new Child(a,b);
		c1.display();
	}
}
