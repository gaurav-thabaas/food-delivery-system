package com.gaurav.food_delivery_system.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class Restaurant extends BaseEntity{



    private String name;
    private String description;
    private Long phone;
    private String email;
    private LocalDateTime openingTime;
    private LocalDateTime closingTime;
    private String status;
    private Integer rating;

}
