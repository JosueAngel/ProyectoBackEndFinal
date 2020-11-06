package Proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class ProyectoBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoBackEndApplication.class, args);
	}

}
