package com.demo.kafka.consumer.poc.consumer;

import com.demo.kafka.consumer.poc.dto.MessageKey;
import com.demo.kafka.consumer.poc.dto.MessageValue;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.stereotype.Service;



@Service
public class Consumer {

    private static final Logger LOG = LoggerFactory.getLogger(Consumer.class);
    private final KafkaListenerEndpointRegistry registry;

    public static final String TOPIC_NAME = "kafka-test-topic";

    public Consumer(KafkaListenerEndpointRegistry registry) {
        this.registry = registry;
    }

    @KafkaListener(topics = "${spring.kafka.consumer.topics}", groupId = "${spring.kafka.consumer.group-id}")
    public void receive(ConsumerRecord<MessageKey, MessageValue> consumerRecord) {
        MessageKey key = consumerRecord.key();
        MessageValue value = consumerRecord.value();
        LOG.info("consuming {}, {}", key, value);
    }
}
