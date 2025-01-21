import java.io.File;

public class CheckingFileProperties {
    public static void main(String[] args) {
        File file = new File("FileIO/learnFileStream.txt");
        if(file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
