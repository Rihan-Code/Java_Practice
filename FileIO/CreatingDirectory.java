import java.io.File;

public class CreatingDirectory {
    public static void main(String[] args) {
        String directoryName = "FileIO/NewDirectory";
        File directory = new File(directoryName);
        if(directory.mkdir()) {
            System.out.println("Directory created successfully: " + directoryName);
        } else {
            System.out.println("Failed to create directory: " + directoryName);
        }
    }
}
