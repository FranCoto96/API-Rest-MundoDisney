package com.example.mundoDisney.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mundoDisney.entities.Users;
import com.example.mundoDisney.service.UserService;

@Controller
@RequestMapping("/private")
public class PrivateController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/index")
	public String index(Authentication auth, HttpSession session) {
		String username = auth.getName();
		if(session.getAttribute("usuario")== null) {
			Users usuario = userService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "index";
	}
	
}
