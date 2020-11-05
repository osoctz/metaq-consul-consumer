package cn.metaq.consul.consumer.controller;

import cn.metaq.consul.consumer.client.ProducerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private ProducerClient client;

    @GetMapping("consumer")
    public String hello() {

        return client.hello() + " -> consumer";
    }
}
