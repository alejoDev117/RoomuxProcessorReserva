package com.uco.RommuxProcessorReserva;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RommuxProcessorReservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RommuxProcessorReservaApplication.class, args);
	}

}
