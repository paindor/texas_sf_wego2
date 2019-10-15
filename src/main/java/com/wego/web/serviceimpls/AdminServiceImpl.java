package com.wego.web.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wego.web.domains.AdminDTO;
import com.wego.web.mappers.AdminMapper;
import com.wego.web.services.AdminService;


@Service
public class AdminServiceImpl implements AdminService{
	@Autowired AdminMapper adminMapper;

	@Override
	public int findTheNumberOfAdmins() {
		return adminMapper.countAllAdmins();
	}

}