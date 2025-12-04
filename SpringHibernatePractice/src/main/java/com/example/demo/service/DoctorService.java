package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.DoctorBean;
import com.example.demo.dao.DoctorDao;

@Service
public class DoctorService {
@Autowired
private DoctorDao ddao;

@Transactional
public String addDoctor(DoctorBean db)
{
	return ddao.addDoctor(db)+" record added successfully";
}
@Transactional
public String updateDoctor(DoctorBean db)
{
	return ddao.updateDoctor(db)+" record updated successfully";
}
@Transactional
public String deleteDoctor(int id)
{
	return ddao.deleteDoctor(id)+" record delete successfully";
}

public List<DoctorBean> selectAll()
{
	ArrayList<DoctorBean>l=null;
	
	l.addAll(ddao.selectAll());
	return l;
}
}
