package com.example.mundoDisney.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.mundoDisney.entities.Users;
import com.example.mundoDisney.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/auth/login")
	public String login(Model model) {
		model.addAttribute("usuario", new Users());
		return "login";
	}
	
	
	@GetMapping("/auth/register")
	public String registerForm(Model model) {
		model.addAttribute("usuario", new Users());
		return "registro";
	}
	@PostMapping("/auth/register")
	public String register(@Validated @ModelAttribute Users usuario, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "redirect:/auth/register";
		}else {
			model.addAttribute("usuario", userService.registrar(usuario));
		}
		return "redirect:/auth/login";
		
	}
}
