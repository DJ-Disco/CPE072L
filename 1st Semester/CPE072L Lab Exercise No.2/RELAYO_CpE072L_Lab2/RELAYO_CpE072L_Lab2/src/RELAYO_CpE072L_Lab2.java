import java.util.*;
import java.io.*;

public class RELAYO_CpE072L_Lab2 {

    public static void main(String[] args) throws Exception {
        TextCounter tc = new TextCounter();

        boolean isRunning = true;
        
        do {
            try {
                Scanner input = new Scanner (System.in);
                System.out.print("Please Enter the Filename: ");
                String file_name = input.nextLine();
                Scanner file_input = new Scanner (new File(file_name));
                Scanner countLine = new Scanner (new File(file_name));
                String[] arr = tc.readFile(file_input, countLine);
                tc.displaySummary(tc.countString(arr), arr);
                isRunning = tc.exitProgram();
            } catch (FileNotFoundException error) {
                System.out.println("File name is not valid! Try again!");
            }
        } while (isRunning);
    }
}
