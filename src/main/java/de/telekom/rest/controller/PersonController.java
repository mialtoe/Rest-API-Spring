package de.telekom.rest.controller;



import de.telekom.rest.entity.Person;
import de.telekom.rest.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
	    
	    public List<Person> getPerson(){
	    	
	    	
	    	List<Person> personList = personRepository.findAll();
	    	return personList;
	    }
	    
}
