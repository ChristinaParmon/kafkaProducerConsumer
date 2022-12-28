package com.example.kafkaproducerconsumer.controller;

import com.example.kafkaproducerconsumer.model.Address;
import com.example.kafkaproducerconsumer.model.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("msg")
public class Controller {

    @Autowired
    private KafkaTemplate<Long, EmployeeDto> kafkaTemplate;

    @PostMapping
    public void sendOrder(Long msgId, EmployeeDto msg) {
        Address address = new Address("Belarus", "Minsk", "Makayonka", 12, 234);
        msg.setAddress(address);
        msg.setName("Ivan");
        kafkaTemplate.send("msg", msgId, msg);
        kafkaTemplate.flush();
    }
}