package io.github.developerheart.gastosclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GastosClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GastosClientApplication.class, args);
	}

}
