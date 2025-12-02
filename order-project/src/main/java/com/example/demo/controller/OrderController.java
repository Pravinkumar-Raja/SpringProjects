package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/order")
public class OrderController {

@GetMapping("/login")
public ModelAndView meth1()
{
	return new ModelAndView("Login");
}
@PostMapping("/validate")
public ModelAndView meth2(@RequestParam("user")String user,@RequestParam("pass")String pass,Model model)
{
	if(user.equalsIgnoreCase("Pravin")&&pass.equalsIgnoreCase("pk@123456789"))
	{
		return new ModelAndView("UPI");
	}
	else
	{
		 model.addAttribute("error", "Invalid username or password.");
		return new ModelAndView("Login");
	}
}
@PostMapping("/upiPayment")
public String meth3(@RequestParam("amount")int amount,@RequestParam("upino")int upino )
{
	int length=String.valueOf(upino).length();
	if(amount>0&&length==6)
	{
		return "<h1>Thanks for Ordering the product</h1>";
	}
	else
	{
		
		return "<h1>Invalid Username or Password, Try again!</h1>";
	}
}
@GetMapping("/data")
public String meth4()
{
	return "<h1>Thanks for Ordering the product </h1>"; 
}
}
