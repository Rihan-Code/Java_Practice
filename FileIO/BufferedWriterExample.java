import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("FileIO/leanFileStream.txt", true))) {
            writer.write("Appending ");
        }
    }
}
