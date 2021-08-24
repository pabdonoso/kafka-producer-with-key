package com.pablo.kafka;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducer kafkaProducer;


    @PostMapping("/cdc-messages/send")
    public ResponseEntity<String> sendCDCMessage(@RequestBody String message) {

        CDCEvent cdcEvent=new Gson().fromJson(message,CDCEvent.class);

        log.info("==> Receive CDC Rest Event:"+message);
        kafkaProducer.sendCDCMessage(cdcEvent.getTopic(),cdcEvent.getKey(),cdcEvent.getValue()) ;
        return ResponseEntity.ok(cdcEvent.getValue());
    }
    @PostMapping("/messages/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message, @RequestParam String topic) {

        log.info("==> Receive topic:"+topic);
        log.info("==> Receive Rest Event:"+message);
        kafkaProducer.sendMessage(topic,message);
        return ResponseEntity.ok(message);
    }



    @GetMapping("/status")
    public ResponseEntity<String> status() {

        log.info("==> Receive status request");
        return ResponseEntity.ok(HttpStatus.OK.toString());
    }


}
