package com.wego.web.services;

import com.wego.web.domains.AdminDTO;
import org.springframework.stereotype.Component;
@Component
public interface AdminService {
	
	public int findTheNumberOfAdmins();

}
