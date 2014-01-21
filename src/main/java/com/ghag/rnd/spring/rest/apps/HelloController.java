package com.ghag.rnd.spring.rest.apps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloapp")
public class HelloController {

	 @RequestMapping("/")
	    public String index() {
	        return "Greetings from Spring Boot! from ganesh ghag spring rest app";
	    }


}
