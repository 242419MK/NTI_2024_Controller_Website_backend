package com.infstos.backend;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class CaptchaService {

    private static final String GOOGLE_RECAPTCHA_VERIFY_URL = "https://www.google.com/recaptcha/api/siteverify";
    private static final String SECRET_KEY = "your-secret-key";

    @SuppressWarnings("null")
    public boolean verifyCaptcha(String captchaResponse) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> body = new HashMap<>();
        body.put("secret", SECRET_KEY);
        body.put("response", captchaResponse);

        Map response = restTemplate.postForObject(GOOGLE_RECAPTCHA_VERIFY_URL, body, Map.class);
        return (Boolean) response.get("success");
    }
}