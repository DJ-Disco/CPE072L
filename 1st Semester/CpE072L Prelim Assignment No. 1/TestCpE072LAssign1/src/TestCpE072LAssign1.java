public class TestCpE072LAssign1 {
    public static void main(String[] args) throws Exception {
        TraingleAsterisk triangle = new TraingleAsterisk();
        boolean running = true;
        do {

            triangle.drawTriangle(triangle.readOddNumber());
            
            if(triangle.tryAgain()) {
                System.out.println();
                running = true;
            } else {
                System.out.println("Program terminated!");
                running = false;
            }

        } while (running);

    }
}
