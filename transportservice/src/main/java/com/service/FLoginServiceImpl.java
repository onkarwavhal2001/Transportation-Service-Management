package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FLoginRepository;
import com.model.FLogin;

@Service
public class FLoginServiceImpl implements FLoginService
{
	@Autowired
	FLoginRepository floginRepo;
	
	public FLogin saveFLogin(FLogin f)
	{
		floginRepo.save(f);
		return f;
	}

}
