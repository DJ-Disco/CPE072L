package relayo_cpe072l_lab3;

import java.lang.Character;

public class CreditCardCipher {
    protected char[] encryptionCode = new char[10];
    protected char[] decryptionCode = new char[10];
    
    CreditCardCipher (int shiftValue) {
        for (int i=0; i<10; i++) {
            encryptionCode[i] = (char)('0' + ((i + shiftValue) % 10));
            decryptionCode[i] = (char)('0' + ((i - shiftValue + 10) % 10));
        }
    }
    
    public String transform(String text, char[] code) {
        char[] msg = text.toCharArray();
        
        for (int i = 0; i < msg.length; i++) {
            
            if (Character.isDigit(msg[i])) {
                int digit = msg[i] - '0';
                msg[i] = code[digit];
            }
        }
        
        return new String(msg);
    }
    
    public String encrypt(String message) {
        return transform(message, encryptionCode);
    }
    
    public String decrypt(String secret) {
        return transform (secret, decryptionCode);
    }
    
    
}
