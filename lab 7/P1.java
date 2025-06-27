import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registerd;
    String[] sub_code;
    int[] sub_credits;
    String[] gread_obtained;
    double spi;

    
    Student(int id_no, int no_of_subjects_registerd, String[] sub_code, int[] sub_credits, String[] gread_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registerd = no_of_subjects_registerd;
        this.sub_code = sub_code;
        this.sub_credits = sub_credits;
        this.gread_obtained = gread_obtained;
    }

   
    double spi() {
        double creditSum = 0, greadSum = 0;

        for (int j = 0; j < no_of_subjects_registerd; j++) {
            double gradeValue = 0;

            switch (gread_obtained[j].toUpperCase()) {
                case "A++":
                    gradeValue = 10;
                    break;
                case "A+":
                    gradeValue = 9;
                    break;
                case "A":
                    gradeValue = 8;
                    break;
                case "B+":
                    gradeValue = 7;
                    break;
                case "B":
                    gradeValue = 6;
                    break;
                case "C":
                    gradeValue = 5;
                    break;
                case "P":
                    gradeValue = 4;
                    break;
                default:
                    gradeValue = 0; 
            }

            creditSum += sub_credits[j];
            greadSum += sub_credits[j] * gradeValue;
        }

        spi = (creditSum == 0) ? 0 : greadSum / creditSum;
        return spi;
    }

   
    void printDetails() {
        System.out.println("\nStudent ID: " + id_no);
        System.out.println("Number of Subjects Registered: " + no_of_subjects_registerd);

        for (int j = 0; j < no_of_subjects_registerd; j++) {
            System.out.println(" Subject " + (j + 1) + " Code: " + sub_code[j]);
            System.out.println("  Credit: " + sub_credits[j]);
            System.out.println("  Grade Obtained: " + gread_obtained[j]);
        }

        System.out.println("SPI: " + spi());
    }
}

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Student ID: ");
            int id_no = sc.nextInt();
            System.out.print("Enter the number of subjects registered: ");
            int no_of_subjects_registerd = sc.nextInt();
            String[] sub_code = new String[no_of_subjects_registerd];
            int[] sub_credits = new int[no_of_subjects_registerd];
            String[] gread_obtained = new String[no_of_subjects_registerd];
                sc.nextLine();
            for (int j = 0; j < no_of_subjects_registerd; j++) {
                System.out.print("Enter subject " + (j + 1) + " code: ");
                sub_code[j] = sc.nextLine();


                System.out.print("Enter subject " + (j + 1) + " credit: ");
                sub_credits[j] = sc.nextInt();
                sc.nextLine(); 

                System.out.print("Enter grade obtained in subject " + (j + 1) + ": ");
                gread_obtained[j] = sc.nextLine();
            }

            students[i] = new Student(id_no, no_of_subjects_registerd, sub_code, sub_credits, gread_obtained);
        }
        students[0].printDetails();
        sc.close();
    }
}
