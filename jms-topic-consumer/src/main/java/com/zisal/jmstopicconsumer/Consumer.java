package com.zisal.jmstopicconsumer;

import com.zisal.jmsdata.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created on 10/12/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @JmsListener(destination = JmsTopicConsumerApplication.TOPIC, containerFactory = "basicConnectionFactory")
    public void receiveTopicMessage(Employee employee) {

        LOGGER.info("received <" + employee.toString() + ">");
    }

}
