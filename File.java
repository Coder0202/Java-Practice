
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;

        System.out.println("Enter the name of file (with .txt extension): ");
        fileName = scanner.nextLine();

        // Create 
        try {
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Enter text to write to  file ('exit' to finish): ");
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
                writer.write(input + System.lineSeparator());
            }
            writer.close();
            System.out.println("written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred  writing  file.");
            e.printStackTrace();
        }

        // Read 
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            System.out.println("Contents of the file:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Modify 
        try {
            FileWriter writer = new FileWriter(fileName, true); // true for append mode
            System.out.println("Enter text to append file ('exit'  finish): ");
            String input;
            while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
                writer.write(input + System.lineSeparator());
            }
            writer.close();
            System.out.println("modified successfully.");
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }

        // Read and updated contents 
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            System.out.println("Updated contents:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}

