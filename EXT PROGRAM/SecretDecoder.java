import java.io.*;

public class SecretDecoder {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("JEEL_Updated.jpg")) {

            int insertionPoint = 1200;
            int counter = 0;
            int temp;
            boolean readingMessage = false;

            StringBuilder secretMessage = new StringBuilder();

            while ((temp = fis.read()) != -1) {
                counter++;

                // When we reach the insertion point, begin extracting the secret message
                if (counter == insertionPoint) {
                    readingMessage = true;
                }

                if (readingMessage) {
                    char ch = (char) temp;
                    if (ch == '#') break; // End of message
                    secretMessage.append(ch);
                }
            }

            System.out.println("Extracted Secret Message: " + secretMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
