
 abstract class  Vegitables
 {
        String color="" ;
  abstract public String tostring();

}
class Potato extends Vegitables
{
    public Potato() {
           super.color="skiny";
    }
    public String tostring(){
        return("POTATO COLOR IS " +super.color);
    }
        

}
class Brindgel extends Vegitables{

    public Brindgel() {
        super.color="purpel";
    }
            
        public String tostring(){
              return ("BRINDEL COLOR IS " +super.color);
        }

}
class Tomato extends Vegitables{

    public Tomato() {
        super.color="red";
    }
        
        public String tostring(){
                return ("TOMATO COLOR IS " +super.color);
        }
    
}

public class p1 {
        public static void main(String[] args) {
        Vegitables v1=new Potato();
        Vegitables v2=new Tomato();
        Vegitables v3=new Brindgel();
                
             System.out.println(v1.tostring());
             System.out.println(v2.tostring());
             System.out.println(v3.tostring());

        }
}
