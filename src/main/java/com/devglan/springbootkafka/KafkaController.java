package com.devglan.springbootkafka;

import com.devglan.springbootkafka.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/send")
    public String sendMessage(){
        producerService.send();
        return "success";
    }
}
