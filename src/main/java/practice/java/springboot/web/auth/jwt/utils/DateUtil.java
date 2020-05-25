package practice.java.springboot.web.auth.jwt.utils;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

@Component
public class DateUtil {
	
	public static Long DateMilis() {
		return System.currentTimeMillis();
	}
	
	public static String SimpleDate(Long date) {
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
		String resultDate = simpleFormat.format(date);
		return resultDate;
	}
	
	public static String DetailDate(Long date) {
		SimpleDateFormat simpleFormat =new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		String resultDate = simpleFormat.format(date);
		return resultDate;
	}
}
