package com.ghag.rnd.spring.rest.apps;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ghag.rnd.spring.rest.domain.Person;
 
@RestController
@RequestMapping("/mongo")
public class MongoBaseController {
    
	@RequestMapping("/")
    public List<Person> index() {
		
		System.out.println("inside mongo getAllPersons()");
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("001"));
		persons.add(new Person("002"));
		persons.add(new Person("003"));
		persons.add(new Person("004"));
		
        return persons;
    }
	
	@RequestMapping("/{personId}")
    public Person getPerson(@PathVariable String personId) {
		
		System.out.println("inside mongo getPerson() with personId="+personId);
		
        return new Person(personId);
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Person> insertPerson(@RequestBody Person person, UriComponentsBuilder builder) {
		
		System.out.println("inside mongo insertPerson with person "+person);
		person.setDesignation("inserted in mongo");
		
		return new ResponseEntity<Person>(person,HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.DELETE, value="/{personId}")
    public Person deletePerson(@PathVariable String personId) {
		
		System.out.println("inside mongo deletePerson() with personId="+personId);
        return new Person(personId);
    }

	@RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Person> updatePerson(@RequestBody Person person, UriComponentsBuilder builder) {
		
		System.out.println("inside mongo updatePerson with person "+person);
		person.setDesignation("updated in mongo");
		
		return new ResponseEntity<Person>(person,HttpStatus.CREATED);
	}
}
