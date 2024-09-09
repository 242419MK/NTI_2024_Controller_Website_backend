package com.infstos.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user, @RequestParam("recaptcha") String recaptchaResponse) {
        // Sprawdź reCAPTCHA (kod reCAPTCHA będzie niżej)
        boolean captchaVerified = verifyRecaptcha(recaptchaResponse);
        if (!captchaVerified) {
            return "Captcha failed!";
        }

        userService.registerUser(user);
        return "User registered successfully!";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Tutaj dodajemy logikę do logowania
        return "Logged in";
    }

    private boolean verifyRecaptcha(String recaptchaResponse) {
        // Implementacja logiki weryfikacji reCAPTCHA (np. za pomocą Google reCAPTCHA API)
        return true; // Zwracamy true dla uproszczenia w tej chwili
    }
}