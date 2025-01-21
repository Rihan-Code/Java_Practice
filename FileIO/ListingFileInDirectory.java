import java.io.File;

public class ListingFileInDirectory {
    public static void main(String[] args) {
        File directory = new File("FileIO");
        File[] files = directory.listFiles();
        // String[] files = directory.list();
        if(files != null) {
            for(File file : files) {
                System.out.println(file.getName());
                // System.out.println(file);
            }
        } else {
            System.out.println("Directory does not exist.");
        }
    }
}
