package com.example.kafkaproducerconsumer;

import com.example.kafkaproducerconsumer.model.EmployeeDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class KafkaProducerConsumerApplication {
    @KafkaListener(topics = "msg")
    public void orderListener(ConsumerRecord<Long, EmployeeDto> record) {
        System.out.println(record.partition());
        System.out.println(record.key());
        System.out.println(record.value());
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerConsumerApplication.class, args);
    }

}
