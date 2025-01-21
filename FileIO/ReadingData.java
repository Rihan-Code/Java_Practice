import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingData {
    public static void main(String[] args) {
        // Reading data from a file using BufferedReader
        System.out.println("Reading data from a file using BufferedReader: ");
        try(BufferedReader reader = new BufferedReader(new FileReader("FileIO/learnFileStream.txt"))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        // Reading data from a file using Scanner
        System.out.println("\nReading data from a file using Scanner: ");
        try(Scanner scanner = new Scanner(new FileReader("FileIO/learnFileStream.txt"))) {
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch(IOException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
