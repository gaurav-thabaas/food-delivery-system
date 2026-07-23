package com.gaurav.food_delivery_system.dto.request;



import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDto {

    private Long id;
    private String status;
    private Integer totalAmount;
    private LocalDateTime orderTime;
    private LocalDateTime deliveryTime;
}
