package com.wego.web.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;

import com.wego.web.domains.UserDTO;
import com.wego.web.mappers.UserMapper;
import com.wego.web.services.UserService;

public class UserServiceImpl implements UserService{
	@Autowired UserMapper userMapper;
	@Override
	public UserDTO login() {
		// TODO Auto-generated method stub
		return null;
	}

}
