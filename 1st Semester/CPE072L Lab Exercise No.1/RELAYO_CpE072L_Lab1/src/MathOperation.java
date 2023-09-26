import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class MathOperation {
    
    Scanner input = new Scanner(System.in);
    MathOperation() {}

    //Shows user mathematical operations and returns selected operation
    public int selectOperation() {
        while (true) {
            try {

                System.out.println("---------------------------------------");
                System.out.println("Mathematical Operation");
                System.out.println("---------------------------------------");
                System.out.println("1 - Square of a number");
                System.out.println("2 - Cube of a number");
                System.out.println("3 - Sum of the square of 1 to nth a number");
                System.out.println("4 - Sum of the Reverse Power of 1 to n");
                System.out.println("5 - Equivalent single digit of a number n");
                System.out.println("0 - Program Exit");
                System.out.println("---------------------------------------");
                System.out.print("Choose one of the operations: ");

                return input.nextInt();
            
            //Catches invalid user input
            } catch (InputMismatchException error1) {

                System.out.printf("Error: Exception from the \"main\" line\n%s\n", error1);
                System.out.println("Please enter valid math operation, Try again!\n");
                input.nextLine();

            }
        }
    }

    //Asks the user to enter a number
    public int acceptNumber() {

        int check_num = 0;

        do {
            try {

                System.out.print("Enter a number from 1 to 999: ");

                check_num = input.nextInt();

            //Catches invalid user input
            } catch (InputMismatchException error2) {

                System.out.printf("Error: Exception from the \"main\" line\n%s\n", error2);
                System.out.println("Please enter valid math operation, Try again!");
                input.nextLine();

            }
        } while (check_num <= 0 || check_num >= 1000);

        return check_num;   
    }

    //Returns a square of an integer
    public long calculateSquareOfNumber(int num) {

        return num*num;

    }

    //Returns a cube of an integer
    public long calculateCubeOfNumber(int num) {

        return num*num*num;

    }

    //Returns sum of squares of an integer
    public long calculateSumOfSquare(int num) {

        int result = 0;

        for (int i = 1; i<=num; i++) {
            result += i*i;
        }

        return result;

    }

    //Returns sum of reverse power of an integer
    public long calculateSumOfReversePower(int num) {

        int result = 0;

        for (int i = 1; i<=num; i++) {

            int n = 1;

            for (int j = num; j >= i; j--) {
                n *= i;
            }

            result += n;

        }

        return result;

    }

    //Returns equivalent single digit of an integer
    public int getEquivalentSingleDigit(int num) {

        int result = 0;

        do {

            num = (num/10) + (num%10);
            result = num;

        } while (result > 9);

        return result;
    }

    //Displays the results depending on the chosen operation
    public void displayResult(int choice, long result, int input) {
        
        switch (choice) {
            case 1:

                System.out.printf("The square of %d is equal to %d\n\n", input, result);
                break;

            case 2:

                System.out.printf("The cube of %d is equal to %d\n\n", input, result);
                break;

            case 3:

                System.out.printf("The sum of the square of 1 to %d is equal to %d\n\n", input, result);
                break;

            case 4:

                System.out.printf("The sum of the reverse power of 1 to %d is equal to %d\n\n", input, result);
                break;

            case 5:

                System.out.printf("The equivalent of single digit of %d is equal to %d\n\n", input, result);
                break;
        }
    }

    //Displays message when exiting program
    public void exitProgram() {

        System.out.println("Thank you for using this program!");
        System.out.println("Process completed.");

    }

    //Asks if user wants to use the program again
    public boolean tryAnother() {

        String user_input;

        while (true) {
            try {
                
                user_input = JOptionPane.showInputDialog(null, "Do you want to continue?(Y/N)", null, 3).toLowerCase();

                if (user_input.equals("y")) {
                    return true;
                } else if (user_input.equals("n")) {
                    exitProgram();
                    return false;
                }

            //Catches error when user selects the "Cancel" or clicks the exit button
            } catch (NullPointerException error3) {

                exitProgram();
                return false;

            } 
        }
    }
}
