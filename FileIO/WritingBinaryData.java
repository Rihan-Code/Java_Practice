import java.io.FileOutputStream;
import java.io.IOException;

public class WritingBinaryData {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("FileIO/binaryData.dat")) {
            fos.write(66); // ASCII value for 'B'
            fos.write(108); // ASCII value for 'l'
            fos.write(117); // ASCII value for 'u'
            fos.write(101); // ASCII value for 'e'
            fos.write(48); // ASCII value for ' '
            fos.write(80); // ASCII value for 'P'
            fos.write(108); // ASCII value for 'l'
            fos.write(97); // ASCII value for 'a'
            fos.write(110); // ASCII value for 'n'
            fos.write(101); // ASCII value for 'e'
            fos.write(116); // ASCII value for 't'

            System.out.println("Binary data written to file.");
        } catch(IOException e) {
            System.out.println("File do not created.");
            e.printStackTrace();
        }
    }
}
