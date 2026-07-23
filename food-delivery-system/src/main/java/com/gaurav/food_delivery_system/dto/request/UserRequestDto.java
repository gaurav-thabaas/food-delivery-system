package com.gaurav.food_delivery_system.dto.request;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserRequestDto {

    private String name;
    private String email;
    private String password;
    private Long phoneNumber;
    private String role;
}
