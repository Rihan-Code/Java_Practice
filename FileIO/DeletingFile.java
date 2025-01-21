import java.io.File;

public class DeletingFile {
    public static void main(String[] args) {
        File file = new File("FileIO/test.txt");
        if(file.delete()) {
            System.out.println("File deleted successfully: " + file.getName());
        } else {
            System.out.println("File does not exists.");
        }
    }
}
