package com.gaurav.food_delivery_system.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class Address extends BaseEntity{


    private String houseNumber;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private Long pincode;
}
