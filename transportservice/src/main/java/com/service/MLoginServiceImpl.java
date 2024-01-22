package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MLoginRepository;
import com.model.MLogin;

@Service
public class MLoginServiceImpl implements MLoginService
{
	@Autowired
	MLoginRepository mloginRepo;
	
	public MLogin saveMLogin(MLogin m)
	{
		mloginRepo.save(m);
		return m;
	}

}
