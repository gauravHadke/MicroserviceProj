package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloClient.HelloClient;

@RestController
public class HomeController {
	
	@Autowired
	private HelloClient helloClient;
	
	@GetMapping(value = "/hi/{name}")
	public String sayHi(@PathVariable("name") String name) {
		String hiMsg="Hiii";
		
		String helloMsg = helloClient.invokeHelloClientService(name);
		
		return hiMsg+"-------"+helloMsg;
	}

}
