package com.gaurav.food_delivery_system.dto.responce;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class AddressResponceDto {


    private Long id;
    private String houseNumber;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private Long pincode;
}
