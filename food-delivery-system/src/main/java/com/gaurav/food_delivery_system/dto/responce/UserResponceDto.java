package com.gaurav.food_delivery_system.dto.responce;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserResponceDto {
    private Long id;
    private String name;
    private String email;
    private Long phoneNumber;
    private String role;
}
