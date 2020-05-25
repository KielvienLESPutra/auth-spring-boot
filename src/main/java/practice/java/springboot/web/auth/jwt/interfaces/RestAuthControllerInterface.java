package practice.java.springboot.web.auth.jwt.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/auth")
public interface RestAuthControllerInterface {
	@PostMapping("/login")
	public void login(@RequestBody String request);
	
	@PostMapping("/check")
	public void checkAuth(@RequestBody String jwt);
	
	@PostMapping("/logout")
	public void logOut(@RequestBody String jwt);
	
	@GetMapping("/checkRestApi")
	public void check();
}
