package com.gaurav.food_delivery_system.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CartRequestDto {


    private Long id;
    private Integer totalAmount;
}
