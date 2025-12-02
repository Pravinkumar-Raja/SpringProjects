package com.example.demo.controller;


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
public ModelAndView meth2(@RequestParam("user")String user,@RequestParam("pass")String pass)
{
	if(user.equalsIgnoreCase("pravin")&&pass.equals("Pk@1234"))
	{
		return new ModelAndView("UPI");
	}
	else
	{
		System.out.println("Invalid Username or Password");
		return new ModelAndView("Login");
	}
}

@PostMapping("/payment")
public String meth3(@RequestParam("amount")int amt,@RequestParam("pin")int upino)
{
	int length=String.valueOf(upino).length();
	if(amt>0&&length==6)
	{
		return "redirect:./data";
	}
	else
	{
		return "Inavlid Amount or UPI Pin";
	}
}
@GetMapping("/data")
public String meth()
{
	return "<h1> Thanks For Ordering the Product</h1>";
			
}
}
