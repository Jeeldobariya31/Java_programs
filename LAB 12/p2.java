import java.io.*;
import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the source file name (file1): ");
        String sourceFile = input.nextLine();

        System.out.print("Enter the destination file name (file2): ");
        String destinationFile = input.nextLine();

        System.out.print("Enter the word to be replaced (word1): ");
        String word1 = input.nextLine();

        System.out.print("Enter the new word (word2): ");
        String word2 = input.nextLine();

        int replacementCount = 0;

        try {
            File file = new File(sourceFile);
            Scanner fileScanner = new Scanner(file);

            StringBuilder modifiedContent = new StringBuilder();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                int countInLine = line.split("\\b" + word1 + "\\b", -1).length - 1;
                replacementCount += countInLine;

                // Replace the word
                line = line.replaceAll("\\b" + word1 + "\\b", word2);
                modifiedContent.append(line).append("\n");
            }

            fileScanner.close();

            // Write to the destination file
            FileWriter writer = new FileWriter(destinationFile);
            writer.write(modifiedContent.toString());
            writer.close();

            System.out.println("Replacement completed.");
            System.out.println("Number of replacements made: " + replacementCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found.");
        } catch (IOException e) {
            System.out.println("Error writing to destination file.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        input.close();
    }
}
