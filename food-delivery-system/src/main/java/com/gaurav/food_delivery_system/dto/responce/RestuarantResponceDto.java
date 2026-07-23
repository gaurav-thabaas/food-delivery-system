package com.gaurav.food_delivery_system.dto.responce;

import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestuarantResponceDto {

    private String name;
    private String description;
    private Long phone;
    private String email;
    private LocalDateTime openingTime;
    private LocalDateTime closingTime;
    private String status;
    private Integer rating;
}
