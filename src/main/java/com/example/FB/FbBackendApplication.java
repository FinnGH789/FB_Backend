package com.example.FB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FbBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FbBackendApplication.class, args);
	}

	@GetMapping(path = "/test")
	public String returnHallo(){
		return "Hallo Welt!";
	}

}
