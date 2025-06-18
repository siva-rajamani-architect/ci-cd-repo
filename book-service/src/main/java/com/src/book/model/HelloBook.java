package com.src.book.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HelloBook {
    private String serviceName;
    private String message;
    private String timestamp;
}
