package com.consummer.m2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewSensorDTO {
    private Long deviceId;
    private String description;
    private int maxValue;
}
