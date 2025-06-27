
final class Parent{
	final int a = 10;
	Parent(){
		this.a =30;
	}
	final public void display(){
		System.out.println("Parent ="+a);
	}

}

class Child extends Parent{
	
	
	public void display(){
		super.display();
		System.out.println("Child ="+a);
	}
}
public class p4{
	public static void main(String[] args){
		
		Child c1 = new Child();
		c1.display();
	}
}