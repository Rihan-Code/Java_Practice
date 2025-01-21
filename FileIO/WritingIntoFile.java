import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFile {
    public static void main(String[] args) {
        // FileWriter writer = null;
        try(FileWriter writer = new FileWriter("FileIO/learnFileStream.txt");) {
            // writer = new FileWriter("FileIO/learnFileStream.txt");
            writer.write("Hello! I am super excited to write into a file using FileWriter class which is used for file streaming.");
            System.out.println("Data written to the file");
        } catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }    
}
