package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 作者 : tinko
 * @version 创建时间：2019年02月28日 下午14:50:33 说明:`{ }
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
	public static void main(String[] args) {
		SpringApplication.run(EurekaApp.class, args);
	}
}