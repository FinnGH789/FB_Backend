package com.example.FB;

import com.example.FB.DataBaseTables.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FbBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FbBackendApplication.class, args);
	}

	@GetMapping(path = "/test")
	public String returnHallo(){
		return "backend con klappt";
	}

	@GetMapping(path = "/person1")
	public Person returnPerson1(Person person){
		person.setId(273741);
		person.setName("Finn");
		person.setAge(20);

		return  person;
	}

	@GetMapping(path = "/test2")
	public List<Person> personList(){
		return List.of(
				new Person(
						273741,
						"Finn",
						20
				)
		);
	}
}
