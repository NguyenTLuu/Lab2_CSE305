import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.StandardSocketOptions;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;



public class AES_Encryption {

    public void saveFile(String encrypt, String decrypt){
        String path = "confidential_doc_output.txt";
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            bufferedWriter.write(encrypt);
            bufferedWriter.write("\n");
            bufferedWriter.write(decrypt);
            System.out.println("Contract saved to " + path);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public AES_Encryption(Contract contract) throws Exception {
        Scanner sc = new Scanner(System.in);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey secretKeykey = keyGen.generateKey();

        Cipher cipher = Cipher.getInstance("AES");

        cipher.init(Cipher.ENCRYPT_MODE, secretKeykey);

        byte[] encryptBytes = cipher.doFinal(contract.toString().getBytes());

        String encryptText = Base64.getEncoder().encodeToString(encryptBytes);

        System.out.println("Encrypted Text : " + encryptText);


        cipher.init(Cipher.DECRYPT_MODE, secretKeykey);

        cipher.doFinal(Base64.getDecoder().decode(encryptText));

        byte[] decryptBytes = cipher.doFinal(Base64.getDecoder().decode(encryptText));

        String decryptText = new String(decryptBytes);

        System.out.println("Decrypted Text : " + decryptText);

        saveFile(encryptText,decryptText);
    }


}