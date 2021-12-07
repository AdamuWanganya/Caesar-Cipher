package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {

    @Test
    void encoding() {

        Cipher testCipher = new Cipher();
        String plainText = "welcome to coding";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int key = 3;
        plainText = plainText.toLowerCase();

        String cText ="";
        for (int i = 0; i<plainText.length(); i++){
            int charIndex = alphabet.indexOf(plainText.charAt(i));
            int newIndex = (charIndex + key) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            cText += String.valueOf(cipherChar);
        }

        assertEquals(cText,testCipher.encoding(plainText, 3));
    }


    @Test
    void decoding() {

            Cipher testCipher = new Cipher();
            String plainText = "";
            String codedText ="";
            String alphabet = "abcde";
            int key = 3;
            for (int i = 0; i<plainText.length(); i++){

                int charIndex = alphabet.indexOf(plainText.charAt(i));
                int newIndex = (charIndex - key) % 26;
                if(newIndex < 0){
                    newIndex = alphabet.length() + newIndex;
                }
                char plainChar = alphabet.charAt(newIndex);
                plainText = plainText + plainChar;
            }
  assertEquals(plainText,testCipher.encoding(codedText, 3));
          }
    @Test
    void allLowerCase_returnsAllLowerCase_String() {
        Cipher testCipher = new Cipher();
        String plainText = "welcome to coding";
        assertEquals(plainText,testCipher.toLowerCase());
    }
}
