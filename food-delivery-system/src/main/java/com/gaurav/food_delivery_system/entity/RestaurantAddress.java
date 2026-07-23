package com.gaurav.food_delivery_system.entity;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class RestaurantAddress extends BaseEntity{

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
