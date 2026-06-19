import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {

        try {
            // Open source file
            FileReader fr = new FileReader("student.txt");

            // Open destination file
            FileWriter fw = new FileWriter("backup.txt");

            int data;

            // Copy contents
            while ((data = fr.read()) != -1) {
                fw.write(data);
            }

            // Close the files
            fr.close();
            fw.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}