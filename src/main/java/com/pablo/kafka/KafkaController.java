package com.pablo.kafka;

import com.pablo.kafka.events.GenericKafkaEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor

public class KafkaController {

    @Autowired
    KafkaProducerService kafkaProducer;


    @PostMapping("/producer/json")
    public String sendMessage(@RequestBody GenericKafkaEvent event, @RequestParam String topic)
    {
        kafkaProducer.send(event,topic);
        return "Message sent successfully to the Kafka topic "+topic;
    }

}
