package com.stacksimplify.restservice.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloWorld")
	public String getHelloWorld() {
		return "Hi Iam Hello World Method";
	}
	
   //@GetMapping("/helloWorld-bean")
	@RequestMapping(method=RequestMethod.GET,path = "/helloWorld-bean")
	public UserDetails getHelloWorldBean() {
		
		return new UserDetails("surya","kille","Kurnool12");
	}

}
