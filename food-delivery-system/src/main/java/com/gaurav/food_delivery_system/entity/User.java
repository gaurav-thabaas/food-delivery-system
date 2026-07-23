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
public class User extends BaseEntity{



    private String name;
    private String email;
    private String password;
    private Long phoneNumber;
    private String role;


}
