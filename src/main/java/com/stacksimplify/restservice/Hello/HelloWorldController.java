package com.stacksimplify.restservice.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloWorld")
	public String getHelloWorld() {
		return "Hi Iam Hello World Method";
	}
	
	@GetMapping("/helloWorld-bean")
	public UserDetails getHelloWorldBean() {
		
		return new UserDetails("surya","kille","Kurnool");
	}

}
