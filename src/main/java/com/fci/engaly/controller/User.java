package com.fci.engaly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fci.engaly.services.MemberDetailsService;

@RestController
@RequestMapping("/user")
public class User {

	@Autowired
	MemberDetailsService memberService;

	@RequestMapping(value = { "", "/hello" })
	public String hello(Authentication auth) {
		return "user => " + memberService.getAutority(auth);
	}
}