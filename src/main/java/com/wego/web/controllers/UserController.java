package com.wego.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wego.web.domains.UserDTO;

@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired Map<String, Object>map;
	
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody UserDTO user) {
		logger.info("AJAX 가 보낸 아이디 와 비번 {} ",user.getUid()+", "+user.getPwd());
		HashMap<String, Object>map2= new HashMap<>();
		map2.put("uid", user.getUid());
		map2.put("pwd", user.getPwd());
		logger.info("map 에 담긴 아이디 와 비번 {} ",map2.get("uid")+", "+map2.get("pwd"));
		return map2;
	}
	

}
