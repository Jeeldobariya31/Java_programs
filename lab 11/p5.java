
public class p5{
        public static void main(String[] args) {
            NumberGenerator n=new NumberGenerator();
            n.start();
        }
}class NumberGenerator extends Thread{
     int  num ;
     @Override
     public void run()
     {
        while (true) { 
                this.num= (int)(Math.random()*100);
                try {
                    sleep(1000);
                } 
                catch (Exception e) 
                {
                        System.out.println(Thread.currentThread().getName() + " interrupted.");   
                }
                if (this.num%2==0) {
                    Square s =new Square(this.num);
                    s.start();
                    try {
                        sleep(1001);
                    } 
                    catch (Exception e) 
                    {
                            System.out.println(Thread.currentThread().getName() + " interrupted.");   
                    }
                }
                else{
                        Cube c=new Cube(this.num);
                        c.start();
                        try {
                            sleep(1001);
                        } 
                        catch (Exception e) 
                        {
                                System.out.println(Thread.currentThread().getName() + " interrupted.");   
                        }
                }
        }
         
     }
}
class Square extends Thread{
        int number;

    public Square(int numbers) {
        this.number=numbers;
    }
    public void run(){
          System.out.println(this.number+" Square is "+(this.number*this.number));
    }
        
}
class Cube extends Thread{
        int number;

        public Cube(int numbers) {
            this.number=numbers;
        }
        public void run(){
              System.out.println(this.number+" cube is "+(this.number*this.number*this.number));
        }    
}
