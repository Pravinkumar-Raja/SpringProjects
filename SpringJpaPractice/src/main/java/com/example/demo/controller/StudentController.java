package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.StudentBean;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentService ss;
@PostMapping("/add")
public String meth1(@RequestBody StudentBean sb)
{
	return "<h1>"+ss.addStudent(sb)+"</h1>";
}
@GetMapping("/selectBy")
public List<StudentBean> meth2(@RequestBody int age)
{
	return ss.selectByAge(age);
}
@DeleteMapping("/deleteBy/{id}")
//public String meth3(@RequestBody int id)
//{
//	return "<h1>"+ss.deleteByid(id)+"</h1>";
//}
public String meth3(@PathVariable int id)
{
	return "<h1>"+ss.deleteByid(id)+"</h1>";

}
@PostMapping("update")
public String meth4(@RequestBody StudentBean sb)
{
	int id=sb.getStdid();
	String depart=sb.getDepartment();
	return "<h1>"+ss.updateDetails(id,depart)+"</h1>";
}
@GetMapping("/selectAll")
public List<StudentBean> meth5()
{
	List<StudentBean>l;
	l=ss.selectAll();
	return l;
}
@PutMapping("/updatePhone")
public String updateBy(@RequestBody StudentBean sb)
{
	int id=sb.getStdid();
	String phone=sb.getPhone();
	System.out.println(id+" "+phone);
	return "<h1>"+ss.updateBy(id,phone)+"</h1>";
}
@PutMapping("/setStatus")
public String meth6(@RequestBody StudentBean sb)
{
	int id=sb.getStdid();
	String sts=sb.getStatus();
	return "<h1>"+ss.setStatus(id,sts)+"</h1>";
}
@PostMapping("/mark")
public String meth8(@RequestBody StudentBean sb)
{
	int id=sb.getStdid();
	Integer marks=sb.getMarks();
	return "<h1>"+ss.Mark(id, marks)+"</h1>";
}
@PutMapping("/setMark")
public String meth7(@RequestBody int id)
{
	return "<h1>"+ss.setMark(id)+"</h1>";
}
}

