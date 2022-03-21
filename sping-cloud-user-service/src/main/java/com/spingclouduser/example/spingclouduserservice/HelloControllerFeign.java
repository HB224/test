package com.spingclouduser.example.spingclouduserservice;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*
author:ghb
*/
@FeignClient("sping-cloud-product-server")
public interface HelloControllerFeign {

    @GetMapping("/hello")
    String sayHello();//方法名和类型可以改
}
