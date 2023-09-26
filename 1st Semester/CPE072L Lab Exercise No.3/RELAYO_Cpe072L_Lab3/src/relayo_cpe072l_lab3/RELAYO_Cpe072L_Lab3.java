package relayo_cpe072l_lab3;

import java.util.Scanner;
import java.lang.Character;

public class RELAYO_Cpe072L_Lab3 {

    public static void main(String[] args) {
        CreditCardCipher cipher = new CreditCardCipher(4);
        Scanner userInput = new Scanner(System.in);
        String strMsg = "";
        
        boolean isRunning = true;
        
        do {
            System.out.print("Enter your 16-digit credit card number >> ");
            boolean hasError = false;
            strMsg = userInput.nextLine();
            char[] array = strMsg.toCharArray();
            
            for (int i = 0; i < array.length; i++) {
                if((i+1) % 5 == 0) {
                    if (array[i] != '-') {
                        hasError = true;
                    }
                } else if (!Character.isDigit(array[i])) {
                    hasError = true;
                } else if (i==18 && hasError==false && array.length == 19){
                    isRunning = false;
                }
            }
            
        } while (isRunning);
        
        System.out.println("Encryption code = "+ new String(cipher.encryptionCode));
        System.out.println("Decryption code = "+ new String(cipher.decryptionCode));
        
        String encoded_msg = cipher.encrypt(strMsg);
        System.out.println("Secret: " + encoded_msg);
        String decoded_msg = cipher.decrypt(encoded_msg);
        System.out.println("Secret: " + decoded_msg);
        
        userInput.close();
        
    }
    
}
