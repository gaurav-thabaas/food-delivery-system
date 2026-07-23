package com.gaurav.food_delivery_system.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PaymentRequestDto {

    private Long id;
    private Integer amount;
    private String paymentMethod;
    private String status;
    private String transactionId;
}
