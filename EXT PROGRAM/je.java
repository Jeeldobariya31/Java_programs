import java.util.Scanner;

class Student{
	int id_no = 0 ;
	int no_of_subjects_registerd = 0;
	String []sub_code;
	int []sub_credits;
	String []gread_obtained;
	double spi;
	Student(int id_no, int no_of_subjects_registerd,String[] sub_code,int[] sub_credits,String[] gread_obtained){
		this.id_no = id_no ;
		this.no_of_subjects_registerd = no_of_subjects_registerd ;
		this.sub_code = sub_code;
		this.sub_credits = sub_credits;
		this.gread_obtained = gread_obtained;
	}

	double spi(){
		double creditSum = 0;
		
		double greadSum = 0 ;
		for(int j = 0 ; j < no_of_subjects_registerd ; j++){
			double a=0;
			if(gread_obtained[j].equals("a++")){
				a = 10;
			}else if(gread_obtained[j].equals("a+")){
				a = 9;
			}else if(gread_obtained[j].equals("a")){
				a = 8;
			}else if(gread_obtained[j].equals("b+")){
				a = 7;
			}else if(gread_obtained[j].equals("b")){
				a = 6;
			}else if(gread_obtained[j].equals("c")){
				a = 5;
			}else if(gread_obtained[j].equals("p")){
				a = 4;
			}
			double multiplication = 1;
			creditSum = creditSum + sub_credits[j];
			multiplication = sub_credits[j]*a;
			greadSum = greadSum + multiplication;
		}
		spi = greadSum/creditSum;
		return spi;
	}
	void printDetails(){
		
			System.out.println("the id_no of student"+id_no);
			
			System.out.println("the no_of_subjects_registerd"+no_of_subjects_registerd);

			

			for(int j = 0 ; j < no_of_subjects_registerd ; j++){
				System.out.println(" the subject code of subject "+(j+1)+" is "+sub_code[j]);
				System.out.println(" the subject credit of subject "+(j+1)+" is "+sub_credits[j]);
				System.out.println(" the gread obtained in subject "+(j+1)+" is "+sub_code[j]);
				
			}
			System.out.println("spi ="+spi);
		
	}
}
public class je{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of student");
		int  n = sc.nextInt();
		Student []stu1 = new Student[n];
		for(int i = 0 ; i < n ; i ++){
			System.out.println("enter the id_no of student");
			int id_no = sc.nextInt();
			System.out.println("enter the no_of_subjects_registerd");
			int no_of_subjects_registerd = sc.nextInt();
			String[] sub_code = new String[no_of_subjects_registerd];
			int[] sub_credits = new int[no_of_subjects_registerd];
			String[] gread_obtained = new String[no_of_subjects_registerd];
			for(int j = 0 ; j < no_of_subjects_registerd ; j++){
				System.out.println("enter the subject code of subject "+(j+1));
				sub_code[j]= sc.nextLine();
				
				System.out.println("enter the subject credit of subject "+(j+1));
				sub_credits[j]= sc.nextInt(); 
				sc.nextLine();
				System.out.println("enter the  gread obtained in subject "+(j+1));
				gread_obtained[j]= sc.nextLine();

			}
			stu1[i]=new Student(id_no,no_of_subjects_registerd,sub_code,sub_credits,gread_obtained);
			 stu1[i].printDetails();
		}
	}
}