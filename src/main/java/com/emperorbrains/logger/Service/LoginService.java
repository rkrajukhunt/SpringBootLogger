package com.emperorbrains.logger.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emperorbrains.logger.Model.Login;
import com.emperorbrains.logger.Resp.LoginResp;

@Service
public class LoginService {
	@Autowired
	private LoginResp loginResp;
	
	public Iterable<Login> getAll() {
		return loginResp.findAll();
	}
	
	public void save(Login l) {
		loginResp.save(l);
	}
}
