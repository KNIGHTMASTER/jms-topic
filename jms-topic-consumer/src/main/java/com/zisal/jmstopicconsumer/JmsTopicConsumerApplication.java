package com.zisal.jmstopicconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsTopicConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsTopicConsumerApplication.class, args);
	}

	public static final String TOPIC = "ExampleTopic";
}
