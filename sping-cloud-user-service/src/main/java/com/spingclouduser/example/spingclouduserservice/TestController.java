package com.spingclouduser.example.spingclouduserservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/*
 */
@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;
    @Bean
    @LoadBalanced
    public  RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/product{id}")
    public String queryProductInfo(@PathVariable("id")int id){
        return restTemplate.getForObject("http://sping-cloud-product-server/product"+id,String.class);
    }



    @Autowired
    HelloControllerFeign helloControllerFeign;
    @GetMapping("/hello")
    public String hello(){
        return helloControllerFeign.sayHello();
    }


}
