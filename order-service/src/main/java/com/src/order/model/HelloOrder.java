package com.src.order.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HelloOrder {
    private String serviceName;
    private String message;
    private String timestamp;
}
