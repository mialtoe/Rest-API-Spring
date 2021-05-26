package de.telekom.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.telekom.rest.controller.*;
//import de.telekom.rest.entity.*;


@SpringBootApplication
public class CustomerApiApplication {

	public static void main(String[] args) {
		 SpringApplication.run(CustomerApiApplication.class, args);
	}

}
