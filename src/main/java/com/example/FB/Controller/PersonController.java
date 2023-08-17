package com.example.FB.Controller;

import com.example.FB.Entity.Person;
import com.example.FB.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200") // --> Wichtig
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/getPersons")
    public List<Person> getPersons(){
        return personService.getPersons();
    }

    @PostMapping("/addPerson")
    public Person postDetails(@RequestBody Person person){
        return personService.saveDetails(person);
    }
}
