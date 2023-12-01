package utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Security;
import java.security.spec.KeySpec;
import java.util.Base64;

public class SecretConverter {

    private static final String super_secret = "Tr1sk3l3L4b$Chal";
    private static final String super_secret2 = new String("\u0054\u0072\u0031\u0073\u006b\u0033\u006c\u0033\u004c\u0034\u0062\u0024\u0043\u0068\u0061\u006c");
    private static final String iv_secret = "0000000000000000";

    @TargetApi(Build.VERSION_CODES.O)
    public static String encrypt(String plainFlag){
        try{
            Cipher cipher = Cipher.getInstance("AES");
            byte[] keyArray = super_secret2.getBytes("utf-8");
            SecretKey keySpec = new SecretKeySpec(keyArray, "AES");
            byte[] iv = iv_secret.getBytes("utf-8");
            IvParameterSpec ivSpec = new IvParameterSpec(iv);
            cipher.init(1, keySpec, ivSpec);
            byte[] enc = cipher.doFinal(plainFlag.getBytes("utf-8"));
            String encFlag = Base64.getUrlEncoder().encodeToString(enc);
            return encFlag;
        }
        catch (Exception e){
            Log.e("ENCRYPTION_ERR", "Encryption failed: " + e.getLocalizedMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static String decrypt(String encFlag) {
        try {

            byte[] keyArray = super_secret.getBytes("utf-8");
            SecretKey keySpec = new SecretKeySpec(keyArray, "AES");
            byte[] iv = iv_secret.getBytes("utf-8");
            IvParameterSpec ivSpec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, keySpec, ivSpec);
            byte[] plaintext = cipher.doFinal();
            return new String(plaintext, "utf-8");
        } catch (Exception e) {
            Log.e("DECRYPTION_ERR", "Decryption failed: " + e.getLocalizedMessage());
            e.printStackTrace();
            return "";
        }
    }
}

