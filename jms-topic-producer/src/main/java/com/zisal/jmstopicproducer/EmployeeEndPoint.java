package com.zisal.jmstopicproducer;

import com.zisal.jmsdata.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 10/12/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
@RequestMapping("/employee")
public class EmployeeEndPoint {

    @Autowired
    Producer producer;

    @PostMapping("/insert")
    public String insertEmployee(@RequestBody Employee p_Employee){
        producer.sendTopic(p_Employee);
        return "OK";
    }
}
