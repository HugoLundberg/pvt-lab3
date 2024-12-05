import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch { 
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputScan = new Scanner(System.in);

        String searchString = inputScan.next(); 
        String patternString = inputScan.next(); 
        String fileString = inputScan.next();

        inputScan.close();

        // ---------- logic ---------------
        if (!searchString.equals("search")) {
            System.out.println("Incorrect input, search, needs to be the first argument"); 
        } else {
            File file = new File(fileString);

            Scanner fileScanner = new Scanner(file);

            int n = 0; 
            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine(); //text line

                if (line.contains(patternString)) {
                    System.out.println("Occurance: " + (n + 1) + " " + line + "\n");
                    n++;
                }

            }
            System.out.println("Number of occurances: " + n); //nice to mention total occurances

        }
    }
}
