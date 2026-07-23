package com.gaurav.food_delivery_system.dto.responce;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItemResponceDto {


    private Long id;
    private Integer amount;
    private Integer quantity;
    private Integer price;
}
