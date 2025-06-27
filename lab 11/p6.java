import java.util.*;
class MatrixSum extends Thread{
        int [][] mat;
        int row;
        int sum=0;
    public MatrixSum(int[][] matrix,int row) {
        this.mat= matrix;
        this.row= row;
    }
        @Override
        public void run(){
              for (int i = 0; i <mat[this.row].length; i++) {
                  this.sum=this.sum+mat[this.row][i];
              }
              System.out.println("som of row no "+this.row+" is "+this.sum);
        } 
}
public class p6 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
             System.out.println("enter matrix order");
             int order=sc.nextInt();
             int [][] matrix= new int [order][order];
             for (int i=0;i<order;i++)
              {
                for (int j=0;j<order;j++)
              {
                System.out.println("Enter element of row "+(i+1)+"element no "+ (j+1)+" :");
                 matrix[i][j]=sc.nextInt();
             } 
             }
             System.out.println("Enter row no for sum");
             int rown= sc.nextInt();
             MatrixSum m=new MatrixSum(matrix,(rown-1));
                  m.start();
        }
}
