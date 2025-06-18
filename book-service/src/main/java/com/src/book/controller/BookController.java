package com.src.book.controller;

import com.src.book.model.HelloBook;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/hello-world")
    public String helloWorldBook() {
        return "Hello World from Book Service";
    }

    @GetMapping("/hello-book")
    public ResponseEntity<HelloBook> helloBook( ) {
        return   ResponseEntity.ok( HelloBook.builder()
                .serviceName("Book Service")
                .message("Hello from Book Service")
                .timestamp(String.valueOf(System.currentTimeMillis()))
                .build());
    }
}
