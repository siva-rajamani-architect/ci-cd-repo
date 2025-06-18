package com.src.user.controller;

import com.src.user.model.HelloUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hello-world")
    public String helloWorldUser() {
        return "Hello World from User Service";
    }

    @GetMapping("/hello-user")
    public ResponseEntity<HelloUser> helloUser( ) {
        return   ResponseEntity.ok( HelloUser.builder()
                .serviceName("User Service")
                .message("Hello from User Service")
                .timestamp(String.valueOf(System.currentTimeMillis()))
                .build());
    }
}
