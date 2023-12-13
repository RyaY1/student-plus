package com.student;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableSwagger2Doc
@SpringBootApplication
@EnableDiscoveryClient
public class ContentApplication {
   public static void main(String[] args) {
      SpringApplication.run(ContentApplication.class, args);
   }
}