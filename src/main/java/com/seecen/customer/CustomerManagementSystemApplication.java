package com.seecen.customer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
//扫描mapper接口必须要加

@ComponentScan(basePackages = "com.seecen")
@MapperScan(basePackages = "com.seecen.customer.dao")
@SpringBootApplication
public class CustomerManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerManagementSystemApplication.class, args);
    }

}

