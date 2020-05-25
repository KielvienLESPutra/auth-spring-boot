package practice.java.springboot.web.auth.jwt.utils;

import org.springframework.stereotype.Component;

@Component
public class CommonUtil {
	public static String maskPass(String pass) {
		int length = pass.length();
		int counter = 0;
		String mask = "";
		while(counter <= length) {
			mask = mask + "X";
		}
		return mask;
	}
	
	public static String generateUUID() {
		return java.util.UUID.randomUUID().toString();
	}
	
	public static boolean checkFormatEmail(String email) {
		if(email.contains("@") && (email.indexOf("@") > 0 && email.indexOf("@") < email.length() - 1)) {
			return true;
		}
		return false;
	}
}
