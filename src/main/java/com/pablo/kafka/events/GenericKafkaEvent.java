package com.pablo.kafka.events;

import lombok.Data;

@Data
public class GenericKafkaEvent {

     String key;
     Value value;
     String topic;

}
