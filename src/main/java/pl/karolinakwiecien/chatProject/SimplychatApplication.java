package pl.karolinakwiecien.chatProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimplychatApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SimplychatApplication.class, args);
	}
}
