package es.ies.puerto.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("es.ies.puerto")
public class StartSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartSpringDataApplication.class, args);
	}

}
