import java.io.FileReader;
import java.io.IOException;

public class StudentFileRead {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("student.txt");

            int ch;

            // Read character by character
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}