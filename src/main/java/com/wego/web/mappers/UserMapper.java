package com.wego.web.mappers;

import com.wego.web.domains.UserDTO;

public interface UserMapper {
	public UserDTO selectUserById(UserDTO param);
	public void insertUser(UserDTO param);
	
}
