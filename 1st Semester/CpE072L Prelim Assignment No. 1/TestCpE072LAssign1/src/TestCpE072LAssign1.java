public class TestCpE072LAssign1 {
    public static void main(String[] args) throws Exception {

        TraingleAsterisk triangle = new TraingleAsterisk();
        boolean isRunning = true;

        do {

            //Runs the program
            triangle.drawTriangle(triangle.readOddNumber());
            
            //Asks users if they want to try again
            if(triangle.tryAgain()) {
                System.out.println();
                isRunning = true;
            } else {
                System.out.println("Program terminated!");
                isRunning = false;
            }

        } while (isRunning);

    }
}
