package practice7.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTask {
    public static void main(String[] args) {
        openFile("data.txt");
    }
    public static void openFile(String fileName) {
        try(FileReader reader = new FileReader(fileName)){
            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to close the file");
        }
    }
}
