package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.StudentBean;
import com.example.demo.dao.StudentDao;

@Service
public class StudentService {
@Autowired
private StudentDao sd;

public String addStudent(StudentBean sb)
{
	if(sb!=null)
	{
		sd.save(sb);
	}
	return "Stduent Added Successfully";
}
public List<StudentBean> selectByAge(int age)
{
	return sd.findByAgeGreaterThan(age);
} 
public String deleteByid(int id)
{
	StudentBean st=sd.findById(id).orElseThrow();
	sd.deleteById(st.getStdid());
	return "Student Deleted Successfully";
}
public String updateDetails(int id,String depart)
{
	StudentBean sb=sd.findById(id).orElseThrow();
	sb.setDepartment(depart);
	sd.save(sb);
	return "Student Department Updated";
	
}
public List<StudentBean> selectAll()
{
	List<StudentBean> l;
	l=sd.findAll();
	return l;
}
public String updateBy(int id,String phone)
{
	StudentBean sb;
	sb=sd.findById(id).orElseThrow();
	sb.setPhone(phone);
	System.out.println(sb);
	sd.save(sb);
	return "Record Updated Succcessfully";
}
public String setStatus(int id,String sts)
{
	StudentBean sb=sd.findById(id).orElseThrow();
	sb.setStatus(sts);
	sd.save(sb);
	return "Status updated Successfully";
}
public String Mark(int id,Integer marks)
{
	StudentBean sb=sd.findById(id).orElseThrow();
	sb.setMarks(marks);
	sd.save(sb);
	int i=1;
	return i+" mark added";
}
public String setMark(int id)
{
	StudentBean sb=sd.findById(id).orElseThrow();
	sb.setMarks(sb.getMarks()+5);
	sd.save(sb);
	return "Marks updated Successfully";
}
}
