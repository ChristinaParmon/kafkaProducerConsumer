package com.example.kafkaproducerconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String country;
    private String city;
    private String street;
    private int homeNumber;
    private int flatNumber;
}
