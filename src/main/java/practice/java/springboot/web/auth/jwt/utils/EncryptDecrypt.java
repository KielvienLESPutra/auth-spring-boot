package practice.java.springboot.web.auth.jwt.utils;

import org.jasypt.util.text.BasicTextEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class EncryptDecrypt {
	private Logger log = LoggerFactory.getLogger(EncryptDecrypt.class);
	
	private String passEncrypt;
	private static String pass;
	private static BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
	
	public EncryptDecrypt(@Value("${spring.jasypt.cred:protectedString}") String value) {
		this.passEncrypt = value;
		this.pass = passEncrypt;
		log.info("====================== Cred {} {} ===========================", passEncrypt, pass);
	}
	
	public static String EncryptData(String data) {
		textEncryptor.setPassword(pass);
		return textEncryptor.encrypt(data);
	}
	
	public static String DecryptData(String data) {
		textEncryptor.setPassword(pass);
		return textEncryptor.decrypt(data);
	}
}
