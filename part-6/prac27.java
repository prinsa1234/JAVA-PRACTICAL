import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class prac27{
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("No files specified.");
            return;
        }

        
        for (String fileName : args) {
            int lineCount = 0;
            
            
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.readLine() != null) {
                    lineCount++;
                }
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (IOException e) {
                
                System.out.println("Error reading file: " + fileName);
            }
        }
    }
}
