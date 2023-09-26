import java.util.*;
import java.io.*;
import java.lang.Character;

public class TextCounter {
    
    TextCounter() {}
    
    
    public String[] readFile(Scanner file_input, Scanner countLine) throws FileNotFoundException {
        int lineCounter = 0;

        while (countLine.hasNextLine()) {
              countLine.nextLine();
            lineCounter++;
            
        }

        String[] line = new String[lineCounter];    

        System.out.println("\nContent of the File >>");
        System.out.println("------------------------------------------------------------------------");
        
        for (int i=0;file_input.hasNextLine();i++) {
            line[i] = file_input.nextLine();
            System.out.println(line[i]);
        }
        System.out.println("------------------------------------------------------------------------");
        
        return line;
        
    }
    public int[] countString(String[] arr) {
    /*array per line
    0 - vowels
    1 - consonants
    2 - digits
    3 - spaces
    4 - lines
    */
        String[] line = arr;
        
        int[] charCounter = new int[5];
        
        charCounter[4] = line.length;
        
        for(int i=0; i<line.length; i++) {
            String current_line = line[i];
            int length = current_line.length();
            for (int j=0; j<length; j++) {
                
                char c = current_line.toLowerCase().charAt(j);
                
                if (Character.isDigit(c)) {
                    charCounter[2]++;
                } else if (Character.isLetter(c)) {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        charCounter[0]++;
                    } else {
                        charCounter[1]++;
                    }
                } else if (Character.isWhitespace(c)) {
                    charCounter[3]++;
                }
                
            }
        }
        
        return charCounter;
         
    }

    public int[] countString (String line) {

        int[] lineCounter = new int[4];
        String current_line = line;
        int length = current_line.length();
        for (int j=0; j<length; j++) {
                
                char c = current_line.toLowerCase().charAt(j);
                
                if (Character.isDigit(c)) {
                    lineCounter[2]++;
                } else if (Character.isLetter(c)) {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        lineCounter[0]++;
                    } else {
                        lineCounter[1]++;
                    }
                } else if (Character.isWhitespace(c)) {
                    lineCounter[3]++;
                }
                
        }
        
        return lineCounter;
    }

    public void displaySummary(int[] charCounter, String[] line) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Summary of Character Counts from the File>>");
        System.out.println("Total count of vowels\t\t>> "+charCounter[0]);
        System.out.println("Total count of consonants\t>> "+charCounter[1]);
        System.out.println("Total count of digits\t\t>> "+charCounter[2]);
        System.out.println("Total count of spaces\t\t>> "+charCounter[3]);
        System.out.println("Total count of lines\t\t>> "+charCounter[4]);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i<charCounter[4];i++) {
            int[] lineCounter = countString(line[i]);
            System.out.printf("Line %d has %d vowels, %d consontants, %d numbers, %d spaces\n", i+1, lineCounter[0], lineCounter[1], lineCounter[2], lineCounter[3]);
        }
        System.out.println("------------------------------------------------------------------------");
    }
    public boolean exitProgram() {
        return false;
    }
}
