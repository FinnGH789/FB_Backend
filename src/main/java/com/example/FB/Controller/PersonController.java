package com.example.FB.Controller;

import com.example.FB.Entity.Person;
import com.example.FB.Repository.PersonRepo;
import com.example.FB.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
