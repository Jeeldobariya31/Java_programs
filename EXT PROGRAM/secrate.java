import java.io.*;
import java.util.*;

public class secrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter secret message in one line:");
            String str = sc.nextLine();
            sc.close();

            FileInputStream fis = new FileInputStream("jeel.jpg");
            FileOutputStream fos = new FileOutputStream("JEEL_Updated.jpg");

            int temp;
            byte[] data = str.getBytes();  // Secret message as bytes
            int counter = 0;

            // 👇 Insertion point: where the secret message starts
            int insertionPoint = 1200;

            while ((temp = fis.read()) != -1) {
                counter++;

                // At the specified point, insert the full message
                if (counter == insertionPoint) {
                    fos.write(data); // Write full message at once
                }

                fos.write(temp); // Write current byte from original file
            }

            fis.close();
            fos.close();

            System.out.println("File updated successfully with hidden message!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
