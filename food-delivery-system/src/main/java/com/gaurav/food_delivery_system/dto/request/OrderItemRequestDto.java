package com.gaurav.food_delivery_system.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class OrderItemRequestDto {


    private Long id;
    private Integer amount;
    private Integer quantity;
    private Integer price;
}
