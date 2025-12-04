package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.DoctorBean;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

@Autowired
private DoctorService ds;
@PostMapping("/add")
public String meth1(@RequestBody DoctorBean db)
{
	return "<h1>"+ds.addDoctor(db)+"</h1>";
}
@PostMapping("/update")
public String meth2(@RequestBody DoctorBean db)
{
	return "<h1>"+ds.updateDoctor(db)+"</h1>";
}
@DeleteMapping("/delete/{id}")
public String meth3(@PathVariable int id)
{
	return "<h1>"+ds.deleteDoctor(id)+"</h1>";
}
@GetMapping("/selectAll")
public List<DoctorBean> meth4()
{
	ArrayList<DoctorBean>l=null;
	l.addAll(ds.selectAll());
	return l;
}
}
