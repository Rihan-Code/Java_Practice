import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        File file = new File("FileIO/learnFileStream.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } 
    }
}