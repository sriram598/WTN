import java.io.FileReader;
import java.io.IOException;

public class CharacterCount {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("student.txt");

            int ch;
            int count = 0;

            // Read file character by character
            while ((ch = fr.read()) != -1) {
                count++;
            }

            fr.close();

            System.out.println("Number of characters in the file = " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}