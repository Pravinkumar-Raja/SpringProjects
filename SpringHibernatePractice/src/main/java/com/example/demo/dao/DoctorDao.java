package com.example.demo.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.DoctorBean;



@Repository
public class DoctorDao {

	@Autowired
	private SessionFactory sessionFactory;
public int addDoctor(DoctorBean db)
{
	int result=0;
	Session s=sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	if(db!=null)
	{
		s.persist(db);
		t.commit();
		result=1;
	}
	s.close();
	return result;
}

public int updateDoctor(DoctorBean db)
{
	int result=0;
	Session s=sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	if(db!=null)
	{
		s.merge(db);
		t.commit();
		s.close();
	}
	return result;
}

public int deleteDoctor(int id)
{
	int result=0;
	Session s=sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	DoctorBean db=new DoctorBean();
	db=s.get(DoctorBean.class,id);
	if(db!=null) {
		s.remove(db);
		t.commit();
		result=1;
		s.close();
	}
	return result;
}

public List<DoctorBean> selectAll()
{
	List<DoctorBean>l;
	Session s=sessionFactory.openSession();
	Query q=s.createQuery("from DoctorBean");//  Native SQL query, Bind the result to Doctor entity
	
	l=q.list();
	return l;
}
}

