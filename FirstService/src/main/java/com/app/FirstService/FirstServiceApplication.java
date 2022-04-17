package com.app.FirstService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/firstService")
public class FirstServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(FirstServiceApplication.class, args);
	}

	@GetMapping("/firstMessage")
	public String getFirstMessage() {
		return String.format("firstMessage in first service");
	}

	@GetMapping("/secondMessage")
	public String getSecondMessage() {
		return String.format("secondMessage in first service");
	}

}
            