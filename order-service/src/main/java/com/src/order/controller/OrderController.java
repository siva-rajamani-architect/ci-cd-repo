package com.src.order.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final RestTemplate restTemplate;


    @GetMapping("/hello-world")
    public String helloWorldOrder() {
        return "Hello World from order Service";
    }

    @GetMapping("/hello-order")
    public String helloOrder( ) {
//        return   ResponseEntity.ok( HelloOrder.builder()
//                .serviceName("order Service")
//                .message("Hello from order Service")
//                .timestamp(String.valueOf(System.currentTimeMillis()))
//                .build());


        String user = restTemplate.getForObject("http://localhost:8083/user/hello-world", String.class);
        String book = restTemplate.getForObject("http://localhost:8081/book/hello-world", String.class);
        return "Order Service calls => " + user + " & " + book;
    }


}
