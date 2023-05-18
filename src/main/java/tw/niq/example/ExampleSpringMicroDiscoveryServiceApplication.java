package tw.niq.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * Step 1. Enable Eureka Server
 */
@EnableEurekaServer
@SpringBootApplication
public class ExampleSpringMicroDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringMicroDiscoveryServiceApplication.class, args);
	}

}
