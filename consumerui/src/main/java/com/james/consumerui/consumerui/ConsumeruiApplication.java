package com.james.consumerui.consumerui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumeruiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeruiApplication.class, args);
	}

}
