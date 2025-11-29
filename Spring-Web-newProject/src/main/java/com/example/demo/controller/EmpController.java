package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.EmployeeBean;
import com.example.demo.service.EmpService;

@RestController
//@CrossOrigin(value="*")
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService eserv;

	@GetMapping("/add")
	public ModelAndView meth1()
	{
		return new ModelAndView("AddEmp");
	}
	@PostMapping("/addEmp")
	public String meth2(@ModelAttribute("emp")EmployeeBean eb)
	{
		return "<h1>"+eserv.addEmp(eb)+" record added successfully </h1>";
	}
	
	@GetMapping("/update")
	public ModelAndView meth3()
	{
		return new ModelAndView("UpdateEmp");
	}
	@PostMapping("/updateEmp")
	public String meth4(@ModelAttribute("emp")EmployeeBean eb)
	{
		return "<h1>"+eserv.updateEmp(eb)+" record updated successfully </h1>";
	}
	@GetMapping("/delete")
	public ModelAndView meth5()
	{
		return new ModelAndView("DeleteEmp");
	}
	@PostMapping("/deleteEmp")
	public String meth6(@RequestParam("eid")int id)
	{
		return "<h1>"+eserv.deleteEmp(id)+" record deleted successfully </h1>";
	}
	
	@GetMapping("/selectAll")
	public ModelAndView meth7(Model m)
	{
		m.addAttribute("allEmp",eserv.selectAllEmp());
		return new ModelAndView("AllEmp");
	}
	
}
