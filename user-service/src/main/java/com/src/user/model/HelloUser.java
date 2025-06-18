package com.src.user.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HelloUser {
    private String serviceName;
    private String message;
    private String timestamp;
}
