package com.zisal.jmstopicproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsTopicProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsTopicProducerApplication.class, args);
	}

	public static final String TOPIC = "ExampleTopic";
}
