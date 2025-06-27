interface Shape {
        public void getArea();
}
class Ractangle implements Shape{
      @Override
        public void getArea(){
        System.out.println("getArea of ractangle called");
      }
}
class Circle implements Shape{
      @Override
        public void getArea(){
        System.out.println("getArea of circle  called");
      }  
}
class Tringle implements Shape{
      @Override
        public void getArea(){
        System.out.println("getArea of tringle called");
      }  
}
public class p2 {
        public static void main(String[] args) {
                Ractangle r1= new Ractangle();
                Circle c1= new Circle();
                Tringle t1=new Tringle();
                r1.getArea();
                c1.getArea();
                t1.getArea();
        }
}
