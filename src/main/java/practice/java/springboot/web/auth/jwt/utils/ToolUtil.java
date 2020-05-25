package practice.java.springboot.web.auth.jwt.utils;

import java.io.Serializable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolUtil implements Serializable{
	private static final long serialVersionUID = 1L;

	@Bean
	public static String generatorUUIDGuid() {
		return java.util.UUID.randomUUID().toString();
	}
}
