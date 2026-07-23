package com.gaurav.food_delivery_system.dto.request;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AddressRequestDto {


    private String houseNumber;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private Long pincode;
}
