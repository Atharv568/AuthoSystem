package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtil {

    public static String hashPassword(String password) {

        try {
            // Step 1: Create hashing algorithm instance
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Step 2: Convert password to hash bytes
            byte[] hashBytes = md.digest(password.getBytes());

            // Step 3: Convert bytes to hexadecimal string
            StringBuilder hash = new StringBuilder();
            for (byte b : hashBytes) {
                hash.append(String.format("%02x", b));
            }

            return hash.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Password hashing failed", e);
        }
    }
}

