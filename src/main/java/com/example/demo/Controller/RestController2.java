package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RestController2 {

    @GetMapping("/hello")

    public String hello() {
        return "hello";
    }

    @GetMapping("/dev/hello")
    public String devHello(HttpServletRequest request) {
        String auth = request.getHeader("Authorization");

        if(!"DEV".equals(auth)){
            throw new AccessDeniedException();
        }

        return "devHello";
    }

    @GetMapping("/real/hello")
    public String realHello(HttpServletRequest request) {
        String auth = request.getHeader("Authorization");

        if(!"PRODUCTION".equals(auth)){
            throw new AccessDeniedException();
        }

        return "productionHello";
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    static class AccessDeniedException extends RuntimeException {

    }
}