
import java.util.Scanner;
 class Book {
private String author;
        Book(String author){
             this.author=author;
        }
       void display(){
              System.out.println("author name = "+this.author);
        }
}
 class  Paper_publication extends Book  {
      private String title;
        Paper_publication(String author,String title ){
            super(author);
            this.title=title;
           }
          void  display(){
                 super.display();
                 System.out.println("Title = "+title);
           }
}
 class Book_publication  extends Book{
       private String title;
        Book_publication(String author,String title){
                super(author);
                this.title=title;
           }
           void display(){
            super.display();
                 System.out.println("Title = "+title);
           }
}
public class p2 {
             public static void main(String[] args) {
                  String author=args[0];
                  args[1]=args[1].toUpperCase();
                  String title=args[2];
                  Book b;
                  if(args[1].equals("BOOK")){
                        b= new Book_publication(author,title);
                        b.display();
                  
                        
                  }
                  else if(args[1].equals("PAPER")){
                        b= new Paper_publication(author,title);
                        b.display();
                  }
                  else{
                        System.out.println("plese cheak your second argument value because second args any on in book or paper ");
                  }

             }
}
