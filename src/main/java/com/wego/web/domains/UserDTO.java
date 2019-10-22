package com.wego.web.domains;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String uid,pwd;

	
	
}
