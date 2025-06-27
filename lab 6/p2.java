import java.util.Scanner;
class time{
   int hour;
   int min;
   int sec;
   time(){

   }
    time(int hour,int min,int sec)
    {
     this.hour=hour;
     this.min=min;
     this.sec=sec;
        
    }
    public void addition(int hours,int mins,int secs)

    {
        int ho=hours;
        int mi=mins;
        int s=secs;
        int temp1,temp2,h=0,m=0;
            
    temp1=this.sec+s;
    while(temp1>=60)
    {
     temp1=temp1-60;
     m++;
    }
    int tsecond=temp1;
    temp2=this.min + mi + m;
    while(temp2>=60)
    {
     temp2=temp2-60;
     h++;
    }
    int tminute=temp2;
    int thour= this.hour + ho+h;
     System.out.println(" total time is "+thour +":"+tminute+":"+tsecond);

    }
}

public class p2{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
      System.out.println("enter first time:");
       System.out.println("enter hours:");
      int h1=sc.nextInt();
      System.out.println("enter  minutes:");
      int m1=sc.nextInt();
      System.out.println("enter  seconds:");
      int s1=sc.nextInt();
       time t1=new time( h1,m1,s1);
       System.out.println("enter second time:");
      System.out.println("enter  hours:");
      int h2=sc.nextInt();
      System.out.println("enter  minutes:");
      int m2=sc.nextInt();
      System.out.println("enter  seconds:");
      int s2=sc.nextInt();
      time t2=new time();
      t1.addition(h2,m2,s2);

    }
}