import java.util.InputMismatchException;
import java.util.Scanner;

public class TraingleAsterisk {
    
    Scanner input = new Scanner(System.in);
    TraingleAsterisk() {}

    public int readOddNumber() {

        int user_input = 0;

        do {

            try {

            System.out.print("Enter positive odd number: ");
            
            user_input = input.nextInt();

            //Catches InputMismatchError
            } catch (InputMismatchException error) {

                System.out.println("You have enter invalid number, Please try again!");
                System.err.printf("ERROR: %s\n", error);
                input.nextLine();

            }

        } while (user_input < 0 || user_input % 2 == 0);

        return user_input;
        
    }

    public void drawTriangle(int odd_num) {

        System.out.printf("The equivalent asterisk isosceles triangle an odd integer %d\n\n",odd_num);

        //Nested for loop that draws the triangle
        for (int i=1; i<=odd_num; i+=2) {

            for (int j=odd_num; j>i; j-=2) {
                System.out.print(" ");
            }

            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

    }

    public boolean tryAgain() {

        String user_input;

        while (true) {

            System.out.print("Do you want to continue?[Y/N]: ");

            user_input = input.next().toLowerCase();

            //Checks if user inputs correct string input
            if (user_input.equals("y")) {
                return true;
            } else if (user_input.equals("n")) {
                return false;
            }
        }

    }

}
