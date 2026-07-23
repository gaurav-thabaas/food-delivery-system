package com.gaurav.food_delivery_system.dto.responce;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CartResponceDto {

    private Long id;
    private Integer totalAmount;
}
