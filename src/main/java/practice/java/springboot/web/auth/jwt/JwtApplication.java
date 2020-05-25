package practice.java.springboot.web.auth.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import practice.java.springboot.web.auth.jwt.controllers.RestControllerJwt;

@SpringBootApplication
@ComponentScan(basePackageClasses = RestControllerJwt.class)
public class JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

}
