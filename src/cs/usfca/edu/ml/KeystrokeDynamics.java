package cs.usfca.edu.ml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication 
@EnableJpaRepositories(basePackages="cs.usfca.edu.ml")
@EntityScan(basePackages="cs.usfca.edu.ml")
@ComponentScan(basePackages="cs.usfca.edu.ml")
public class KeystrokeDynamics {
	public static void main(String[] args) {
		SpringApplication.run(KeystrokeDynamics.class, args);
	}
}
