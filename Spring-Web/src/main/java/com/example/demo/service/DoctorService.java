package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.DoctorBean;
import com.example.demo.dao.AdminDao;

@Service
public class DoctorService {
	
	@Autowired
	
	private AdminDao ado;
	@Transactional
	public int addDoctor(DoctorBean db)

	{

	return ado.addDoctor(db);

	}
	
//	public int updateDoctor(DoctorBean db)
//	{
//		return ado.updateDoctor(db);
//	}
//
//	public int deleteDoctor(int id)
//	{
//		return ado.deleteDoctor(id);
//	}
}
