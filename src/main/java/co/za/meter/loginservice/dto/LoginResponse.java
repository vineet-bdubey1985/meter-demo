package co.za.meter.loginservice.dto;

import lombok.Getter;

@Getter
public class LoginResponse {

    private String message;
    private String token;

    public LoginResponse(String message, String token) {
        this.message = message;
        this.token = token;
    }

}
