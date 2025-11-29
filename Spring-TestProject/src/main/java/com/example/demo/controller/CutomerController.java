package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customer")
public class CutomerController {
	@PostMapping("/data")
	@ResponseBody
	public String meth1()
	{
		return "<h1> Welcome to Customer page </h1>";
	}

}
