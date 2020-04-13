package demo.demoaop;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping("/")
	@LogExecutionTime
	public List<String> hello() {
		return Arrays.asList("Hello","DDD");
	}
	
	@GetMapping("/value")
	public int findValue() {
		return 10;
	}
	
	

}
