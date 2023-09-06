import java.util.Scanner;
import javax.swing.JOptionPane;

public class MathOperation {
    Scanner input = new Scanner(System.in);

    MathOperation() {

    }

    public int selectOperation() {
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
    }

    public int acceptNumber() {
        int check_num;
        do {
            System.out.print("Enter a number from 1 to 999: ");
            check_num = input.nextInt();
        } while (check_num <= 0 || check_num >= 1000);
        return check_num;   
    }

    public long calculateSquareOfNumber(int num) {
        return num*num;
    }
    public long calculateCubeOfNumber(int num) {
        return num*num*num;
    }
    public long calculateSumOfSquare(int num) {
        int total = 0;
        for (int i = 1; i<=num; i++) {
            total += i*i;
        }
        return total;
    }
    public long calculateSumOfReversePower(int num) {
        int total = 0;
        for (int i = 1; i<=num; i++) {
            int n = 1;
            for (int j = num; j >= i; j--) {
                n *= i;
            }
            total += n;
        }
        return total;
    }
    public int getEquivalentSingleDigit(int num) {
        return 123%10;
    }
    public void displayResult(int choice) {

    }
    public void exitProgram() {
        System.out.println("Thank you for using this program!");
        System.out.println("Process completed.");
    }
    public boolean tryAnother() {

        return false;
    }
}
