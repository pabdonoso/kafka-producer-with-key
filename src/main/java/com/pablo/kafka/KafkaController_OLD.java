/*package com.pablo.kafka;

import com.google.gson.Gson;
import com.pablo.kafka.events.CDCEvent;
import com.pablo.kafka.events.GenericKafkaEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class KafkaController_OLD {

    private final KafkaProducer_OLD kafkaProducer_old;


    @PostMapping("/cdc-messages/send")
    public ResponseEntity<String> sendCDCMessage(@RequestBody String message) {

        CDCEvent cdcEvent=new Gson().fromJson(message,CDCEvent.class);

        log.info("==> Receive CDC Event:"+message);
        kafkaProducer.sendCDCMessage(cdcEvent.getTopic(),cdcEvent.getKey(),cdcEvent.getValue()) ;
        return ResponseEntity.ok(cdcEvent.getValue());
    }



    @PostMapping("/messages/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message, @RequestParam String topic) {

        log.info("==> Receive topic:"+topic);
        log.info("==> Receive Event:"+message);
        kafkaProducer.sendMessage(topic,message);
        return ResponseEntity.ok(message);
    }

    @PostMapping("/messages/generic/send")
    public ResponseEntity<String> sendGenericMessage(@RequestBody String message) {

        //String mensaje="{'key':'Pablo','value':{'employee':{'name':'Pablo','salary':50000,'married':true}},'topic':'Test-Kafka-Producer'}";

        GenericKafkaEvent event= new Gson().fromJson(message,GenericKafkaEvent.class);
        log.info("==> Receive Generic Event - name:"+event.toString());
        kafkaProducer.sendMessage(event.getTopic(), event.getKey(), event.getValue().getEmployee().toString());
        return ResponseEntity.ok(message);
    }

    @GetMapping("/status")
    public ResponseEntity<String> status() {

        log.info("==> Receive status request");
        return ResponseEntity.ok(HttpStatus.OK.toString());
    }


}
*/