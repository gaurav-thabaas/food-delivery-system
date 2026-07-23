package com.gaurav.food_delivery_system.dto.responce;

import lombok.*;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder



public class OrderResponceDto {


    private Long id;
    private String status;
    private Integer totalAmount;
    private LocalDateTime orderTime;
    private LocalDateTime deliveryTime;
}
