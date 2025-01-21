import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("FileIO/learnFileStream.txt", true))) {
            writer.write("Appending text using BufferedWriter.");
            writer.newLine();
            writer.write("BufferedWriter is efficient!");
            System.out.println("Data appended to the file.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
