package com.infstos.backend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class zadzilaj_plosie {

    @RequestMapping("/test")
    public String requestMethodName(@RequestParam String param) {
        return new String("Essa");
    }

}
