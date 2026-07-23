package com.gaurav.food_delivery_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class Order extends BaseEntity{


    private String status;
    private Integer totalAmount;
    private LocalDateTime orderTime;
    private LocalDateTime deliveryTime;

}
