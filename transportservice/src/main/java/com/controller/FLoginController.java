package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.FLogin;
import com.service.FLoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FLoginController 
{
	@Autowired
	FLoginService floginService;
	
	@PostMapping("/addflogin")
	public FLogin addFLogin(@RequestBody FLogin f) 
	{
		floginService.saveFLogin(f);
		return f;
	}	
}
