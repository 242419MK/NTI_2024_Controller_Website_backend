package com.infstos.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;



@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @Autowired
    private CaptchaService captchaService;


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

    public String login(@RequestParam String username, @RequestParam String password) {
        try {
            // Tworzymy token logowania na podstawie podanego username i password
            UsernamePasswordAuthenticationToken authenticationToken =
                    new UsernamePasswordAuthenticationToken(username, password);
            
            // Próbujemy uwierzytelnić użytkownika przy pomocy AuthenticationManager
            Authentication authentication = authenticationManager.authenticate(authenticationToken);

            // Jeśli logowanie jest poprawne, zwracamy wiadomość o sukcesie
            return "Logged in successfully!";
        } catch (AuthenticationException e) {
            // W przypadku błędu logowania zwracamy odpowiednią wiadomość
            return "Invalid username or password!";
        }
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, @RequestParam String recaptchaResponse) {
        // Weryfikacja reCAPTCHA
        if (!verifyRecaptcha(recaptchaResponse)) {
            return "reCAPTCHA verification failed!";
        }

        // Logika logowania (jak wcześniej)
        return "Logged in successfully!";
    }

    // Weryfikacja reCAPTCHA z użyciem CaptchaService
    private boolean verifyRecaptcha(String recaptchaResponse) {
        return captchaService.verifyCaptcha(recaptchaResponse);
    }
}