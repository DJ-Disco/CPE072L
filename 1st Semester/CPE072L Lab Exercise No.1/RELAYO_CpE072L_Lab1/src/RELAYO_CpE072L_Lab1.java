public class RELAYO_CpE072L_Lab1 {
    public static void main(String[] args) throws Exception {

        //Create variables/objects
        MathOperation math = new MathOperation();
        int user_input, selected_operation;
        boolean isRunning = true;

        //Run program
        do {

            //Select Math operation
            selected_operation = math.selectOperation();

            //Determines what Math operation to run
            switch (selected_operation) {
                case 1:  

                    user_input = math.acceptNumber();
                    
                    math.displayResult(selected_operation, math.calculateSquareOfNumber(user_input), user_input);

                    isRunning = math.tryAnother();

                    break;

                case 2:
                    user_input = math.acceptNumber();

                    math.displayResult(selected_operation, math.calculateCubeOfNumber(user_input), user_input);

                    isRunning = math.tryAnother();
                    
                    break; 
                case 3:
                    user_input = math.acceptNumber();

                    math.displayResult(selected_operation, math.calculateSumOfSquare(user_input), user_input);

                    isRunning = math.tryAnother();
                                        
                    break;
                case 4:
                    user_input = math.acceptNumber();

                    math.displayResult(selected_operation, math.calculateSumOfReversePower(user_input), user_input);

                    isRunning = math.tryAnother();
                                        
                    break;
                case 5:
                    user_input = math.acceptNumber();
                
                    math.displayResult(selected_operation, math.getEquivalentSingleDigit(user_input), user_input);

                    isRunning = math.tryAnother();
                                        
                    break;
                case 0:
                    math.exitProgram();

                    isRunning = false;

                    break;
            }
        } while (isRunning);
    }
}
