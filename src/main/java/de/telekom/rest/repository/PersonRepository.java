package de.telekom.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import de.telekom.rest.entity.Person;

public interface PersonRepository  extends JpaRepository<Person, Integer>{

}
