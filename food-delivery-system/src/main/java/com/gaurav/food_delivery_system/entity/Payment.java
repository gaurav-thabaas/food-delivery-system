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
public class Payment extends BaseEntity{


    private Integer amount;
    private String paymentMethod;
    private String status;
    private String transactionId;
}
