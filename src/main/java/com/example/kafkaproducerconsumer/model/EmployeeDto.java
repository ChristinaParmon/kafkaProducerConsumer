package com.example.kafkaproducerconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeDto {
    private String name;
    private Address address;
}
