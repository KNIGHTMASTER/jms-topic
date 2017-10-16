package com.zisal.jmstopicproducer;

import com.zisal.jmsdata.Employee;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * Created on 10/12/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    public void sendTopic(Employee p_Employee) {
        System.out.println("Sending MEssage "+p_Employee.toString());
        jmsTemplate.convertAndSend(new ActiveMQTopic(JmsTopicProducerApplication.TOPIC), p_Employee);
    }
}
