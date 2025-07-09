package org.nttdata.spring_kafka.service;



import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "string_topic", groupId = "string_group")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Consumed message: " + record.value());
        System.out.println("Offset: " + record.offset() + ", Partition: " + record.partition());
    }
}
