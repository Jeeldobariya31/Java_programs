 interface  EventListener  {

        public void performEvent() ;
}
 interface MouseListener extends EventListener  {

       public void mouseClicked();
       public void mousePressed();
       public void mouseReleased();
       public void mouseMoved();
       public void mouseDragged();  
}
 interface KeyListener extends EventListener{
       public void keyReleased();
       public void keyPressed();
}
 class EventDemo implements KeyListener,MouseListener{
        @Override
       public void performEvent() {
                  
        System.out.println("performEvent called");
        }
         @Override
       public void mouseClicked(){
                System.out.println("mouseclicked  called");
        }
        @Override
      public  void mousePressed(){
                System.out.println(" mousePressed  called");
        }
        @Override
         public void mouseReleased(){
                System.out.println("mouseReleased  called");
        }
        @Override
       public void mouseMoved(){
                System.out.println("mouseMoved  called");
        } 
        @Override
       public void mouseDragged(){
                System.out.println("mouseDragged  called");
        } 
        @Override
       public void keyReleased(){
                System.out.println("keyReleased  called");
        }
       @Override
       public void keyPressed(){
                System.out.println("keyPressed  called");
        } 
}


public class p1 {
      public static void main(String[] args) {
             EventDemo e=new EventDemo();
             e.performEvent() ;
             e.mouseClicked();
             e. mousePressed();
             e. mouseReleased();
             e. mouseMoved();
             e. mouseDragged();
             e. keyReleased();
              e. keyPressed();
      }
        
}