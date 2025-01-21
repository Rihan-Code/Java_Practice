import java.io.FileInputStream;
import java.io.IOException;

public class ReadingBinaryData {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("FileIO/binaryData.dat")) {
            int byteData;
            while((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch(IOException e) {
            System.out.println("File does not exist.");
            e.printStackTrace();
        }
    }
}
