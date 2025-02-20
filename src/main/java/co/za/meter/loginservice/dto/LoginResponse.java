package co.za.meter.loginservice.dto;

import lombok.Getter;

@Getter
public class LoginResponse {
    private String message;
    private String accessToken;
    private String refreshToken;

    public LoginResponse(String message, String accessToken, String refreshToken) {
        this.message = message;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    // Getters and setters
}
