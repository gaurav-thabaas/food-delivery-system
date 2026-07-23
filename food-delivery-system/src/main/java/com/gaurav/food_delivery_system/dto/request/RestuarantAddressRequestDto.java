package com.gaurav.food_delivery_system.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestuarantAddressRequestDto {

    private String buildingName;

    private String street;

    private String area;

    private String landmark;

    private String city;

    private String state;

    private String country;

    private String pincode;

    private Double latitude;

    private Double longitude;

}
