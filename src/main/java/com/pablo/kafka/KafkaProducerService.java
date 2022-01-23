package com.pablo.kafka;

import com.pablo.kafka.events.GenericKafkaEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private final Logger LOG = LoggerFactory.getLogger(KafkaProducerService.class);
    @Autowired
    private KafkaTemplate<String, GenericKafkaEvent> kafkaTemplate;


    public void send(GenericKafkaEvent event,String topic) {
        LOG.info("Sending User Json Serializer : {}", event);
        kafkaTemplate.send(topic,event.getKey(),event);
    }
}