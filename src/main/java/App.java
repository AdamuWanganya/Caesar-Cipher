import models.Cipher;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cipher testCipher = new Cipher();
        System.out.println("Enter plain Text");
        String plain = scan.nextLine();

        System.out.println("Enter key >>");
        int key = scan.nextInt();

        String cipherText = testCipher.encoding(plain, key);

        System.out.println("Cipher text : " + cipherText);


        System.out.println("The decoded message is : "+ testCipher.decoding(cipherText, key));

    }
    }
