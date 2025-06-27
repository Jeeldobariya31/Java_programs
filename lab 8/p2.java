
interface A{
 int a=5;
    abstract public  void  aMethod();
}
interface A1 extends A{
        int b=10;
        abstract public  void  a1Method();
}
interface A2 extends A{
        int c=15;
        abstract public  void  a2Method();
        
}
interface A12 extends A1,A2{
        int d=20;
        abstract public  void  a12Method();
        
}
class B implements A12{
        public  void  aMethod(){
            System.out.println("JEEL");
            System.out.println(a);
        }
        public  void  a1Method(){
                System.out.println("JEEL");
                System.out.println(b);
        }
        public  void  a2Method(){
                System.out.println("JEEL");
                System.out.println(c);
        }
        public  void  a12Method(){
                System.out.println("JEEL");
                System.out.println(d);
        }

}
public class p2 {
        public static void main(String[] args) {
                B b=new B();
                b.aMethod();  
                b.a1Method();  
                b.a2Method();  
                b.a12Method(); 
        }
      
}
