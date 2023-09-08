public class RELAYO_CpE072L_Lab1 {
    public static void main(String[] args) throws Exception {
        MathOperation math = new MathOperation();
        int user_input;
        boolean isRunning = true;



        do {

            switch (math.selectOperation()) {
                case 1:  

                    user_input = math.acceptNumber();
                    
                    math.displayResult(1, math.calculateSquareOfNumber(user_input), user_input);

                    isRunning = math.tryAnother();

                    break;

                case 2:
                    user_input = math.acceptNumber();

                    math.displayResult(2, math.calculateCubeOfNumber(user_input), user_input);

                    isRunning = math.tryAnother();
                    
                    break; 
                case 3:
                    user_input = math.acceptNumber();

                    math.displayResult(3, math.calculateSumOfSquare(user_input), user_input);

                    isRunning = math.tryAnother();
                                        
                    break;
                case 4:
                    user_input = math.acceptNumber();

                    math.displayResult(4, math.calculateSumOfReversePower(user_input), user_input);

                    isRunning = math.tryAnother();
                                        
                    break;
                case 5:
                    user_input = math.acceptNumber();
                
                    math.displayResult(5, math.getEquivalentSingleDigit(user_input), user_input);

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
