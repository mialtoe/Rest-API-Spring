package de.telekom.rest.controller;



import de.telekom.rest.entity.Person;
import de.telekom.rest.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class PersonController {

	    @Autowired
        PersonRepository personRepository;	
	
	    @RequestMapping(	        
	    		   method = RequestMethod.GET,
	    		   path = "/person",
	    		   produces = MediaType.APPLICATION_JSON_VALUE
	    )
	    
	    @GetMapping
	    public List<Person> getPerson(){
	    	
	    	List<Person> personList = personRepository.findAll();
	    	return personList;
	    		    	
	    }
	    
	    @RequestMapping(	        
	    		   method = RequestMethod.POST,
	    		   path = "/person",
	    		   produces = MediaType.APPLICATION_JSON_VALUE
	    )
	    
	    @PostMapping
	    public ResponseEntity<Person> addPerson(@RequestBody Person p) {
	    	personRepository.save(p);
	    	return new ResponseEntity<>(p, HttpStatus.CREATED);
	    }
	    
}
