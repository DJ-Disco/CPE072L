import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RELAYO_CpE072L_Lab1 {
    public static void main(String[] args) throws Exception {
        MathOperation math = new MathOperation();

        switch (math.selectOperation()) {
            case 1:
                math.calculateSquareOfNumber(math.acceptNumber());
                break;
            case 2:
                math.calculateCubeOfNumber(math.acceptNumber());
                break; 
            case 3:
                math.calculateSumOfSquare(math.acceptNumber());
                break;
            case 4:
                math.calculateSumOfReversePower(math.acceptNumber());
                break;
            case 5:
                math.getEquivalentSingleDigit(math.acceptNumber());
                break;
            case 0:
                break;
            default:
                break;   
        }

    }
}
