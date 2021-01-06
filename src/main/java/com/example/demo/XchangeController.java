package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XchangeController {

	@Autowired
	private XchangeService service;

//	@GetMapping("/currencies")
//	public Xchange getCurrencies() {
//		return service.getCurrencies();
//	}
	
	@GetMapping("/currencies")
	public Xchange getCurrencies() {
		return service.getCurrencies();
	}
}
