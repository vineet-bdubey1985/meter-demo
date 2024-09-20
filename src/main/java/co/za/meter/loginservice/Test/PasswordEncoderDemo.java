package co.za.meter.loginservice.Test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderDemo {
    public static void main(String[] args) {
        // Create an instance of BCryptPasswordEncoder
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        // Plaintext password
        String plaintextPassword = "Password123";

        // Encode the password
        String encodedPassword = passwordEncoder.encode(plaintextPassword);

        // Print the encoded password
        System.out.println("Encoded Password: " + encodedPassword);
    }
}
