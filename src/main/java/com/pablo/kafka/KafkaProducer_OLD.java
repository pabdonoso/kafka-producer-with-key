/*package com.pablo.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer_OLD {
    private final KafkaTemplate<String, String> kafkaTemplate;



    public void sendCDCMessage(String topic, String key, String value) {

        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic, key,value);
        future.addCallback(new ListenableFutureCallback<>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("==> [Producer] Send message at Topic "+topic);
            }
            @Override
            public void onFailure(Throwable ex) {
                log.error("Something went wrong with the message {} ", value);
            }
        });
    }

    public void sendMessage(String topic, String key , String value) {

        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic, key, value);
        future.addCallback(new ListenableFutureCallback<>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("==> [Producer] Send message at Topic "+topic);
            }
            @Override
            public void onFailure(Throwable ex) {
                log.error("Something went wrong with the message {} ", value);
            }
        });
    }
    public void sendMessage(String topic , String value) {

        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic, value);
        future.addCallback(new ListenableFutureCallback<>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("==> [Producer] Send message at Topic "+topic);
            }
            @Override
            public void onFailure(Throwable ex) {
                log.error("Something went wrong with the message {} ", value);
            }
        });
    }

}*/