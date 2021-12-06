package models;

public class Cipher {

    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String encoding(String pText, int key) {
        pText = pText.toLowerCase();
        StringBuilder cText = new StringBuilder();
        for (int i = 0; i<pText.length(); i++){
            int charIndex = alphabet.indexOf(pText.charAt(i));
            int newIndex = (charIndex + key) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            cText.append(cipherChar);
        }
        return cText.toString();
    }
    }
}
