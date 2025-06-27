import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = input.nextLine();

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                charCount += line.length();
            }

            fileScanner.close();

            System.out.println("File: " + filename);
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + filename + "' was not found.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        input.close();
    }
}
