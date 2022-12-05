package com.example.helloClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "helloClient")
public interface HelloClient {
	
	@GetMapping(value = "/hello/{name}")
	public String invokeHelloClientService(@PathVariable("name") String name);

}
