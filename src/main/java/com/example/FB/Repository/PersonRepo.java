package com.example.FB.Repository;

import com.example.FB.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
}
