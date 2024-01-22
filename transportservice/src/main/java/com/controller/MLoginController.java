package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.MLogin;
import com.service.MLoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MLoginController 
{
	@Autowired
	MLoginService mloginService;
	
	@PostMapping("/addmlogin")
	public MLogin addMLogin(@RequestBody MLogin m) 
	{
		mloginService.saveMLogin(m);
		return m;
	}	
}

