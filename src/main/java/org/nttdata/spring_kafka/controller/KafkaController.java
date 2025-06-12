package org.nttdata.spring_kafka.controller;


import org.nttdata.spring_kafka.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService) {
        this.producerService = producerService;

    }

    @PostMapping("/send")
    public void send(@RequestBody String message) {
        producerService.sendMessage(message);
    }
}
