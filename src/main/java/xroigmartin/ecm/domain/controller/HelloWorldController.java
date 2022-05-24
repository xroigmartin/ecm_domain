package xroigmartin.ecm.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(name = "/")
	public String helloWorld() {
		return "Hello world";
	}
}
