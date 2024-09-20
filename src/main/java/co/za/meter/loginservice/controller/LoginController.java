package co.za.meter.loginservice.controller;

import co.za.meter.loginservice.dto.LoginRequest;
import co.za.meter.loginservice.dto.LoginResponse;
import co.za.meter.loginservice.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        String message = userService.authenticateUser(loginRequest.getUsername(), loginRequest.getPassword());
        return new LoginResponse(message);
    }
}