import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch { //good class name
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputScan = new Scanner(System.in);

        String searchString = inputScan.next(); //good variable names
        String patternString = inputScan.next(); 
        String fileString = inputScan.next();

        inputScan.close();

        // ---------- logic ---------------
        if (!searchString.equals("search")) {
            System.out.println("What are you doing?!"); //might be confusing for user
        } else {
            File file = new File(fileString);

            Scanner fileScanner = new Scanner(file);

            int n = 1; //might be a defect, should maybe start with zero
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
