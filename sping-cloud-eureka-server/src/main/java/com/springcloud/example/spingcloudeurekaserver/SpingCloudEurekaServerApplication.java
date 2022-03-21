package com.springcloud.example.spingcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpingCloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpingCloudEurekaServerApplication.class, args);
    }

}
