package com.quinnox.DeviceFarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.quinnox.DeviceFarm"})
public class DeviceFarmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceFarmApplication.class, args);
	}

}
