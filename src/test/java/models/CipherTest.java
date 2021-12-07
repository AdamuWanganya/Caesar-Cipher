package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {

    @Test
    void encoding() {

        Cipher testCipher = new Cipher();
        String pText = "welcome to coding";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int key = 3;
        pText = pText.toLowerCase();
        StringBuilder cText = new StringBuilder();
        for (int i = 0; i<pText.length(); i++){
            int charIndex = alphabet.indexOf(pText.charAt(i));
            int newIndex = (charIndex + key) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            cText.append(cipherChar);
        }

        assertEquals(cText,pText);
    }

    @Test
    void decoding() {

            Cipher testCipher = new Cipher();
            String pText = "";
            String cText ="";
            String alphabet = "abcde";
            int key = 3;
            for (int i = 0; i<cText.length(); i++){

                int charIndex = alphabet.indexOf(cText.charAt(i));
                int newIndex = (charIndex - key) % 26;
                if(newIndex < 0){
                    newIndex = alphabet.length() + newIndex;
                }
                char plainChar = alphabet.charAt(newIndex);
                pText = pText + plainChar;
            }
            assertEquals(pText,cText);
        }


}
