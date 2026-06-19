import java.io.FileWriter;
import java.io.IOException;

public class StudentFileWrite {
    public static void main(String[] args) {

        try {
            // Create FileWriter object
            FileWriter fw = new FileWriter("student.txt");

            // Write content to the file
            fw.write("Name: Sriram\n");
            fw.write("Roll No: 49187\n");
            fw.write("Course: B.Tech_ece\n");

            // Close the stream
            fw.close();

            System.out.println("Data written successfully to student.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}