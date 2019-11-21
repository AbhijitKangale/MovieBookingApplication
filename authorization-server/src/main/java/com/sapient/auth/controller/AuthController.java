package com.sapient.auth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@RequestMapping(value = "/user")
	@ResponseBody
	public Principal getUser(Principal principal) {
		return principal;
	}
}
