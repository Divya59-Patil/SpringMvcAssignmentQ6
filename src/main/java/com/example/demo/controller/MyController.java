package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Customer;

import jakarta.validation.Valid;

@Controller
public class MyController {
	
	@GetMapping("/registration")
	public String openForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "registration";
	}
	
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "registration";
		}
		System.out.println(customer);
		return "success";
	}
}
