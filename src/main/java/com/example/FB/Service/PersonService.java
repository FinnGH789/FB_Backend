package com.example.FB.Service;

import com.example.FB.Entity.Person;
import com.example.FB.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public List<Person> getPersons(){
        return personRepo.findAll();
    }



}
