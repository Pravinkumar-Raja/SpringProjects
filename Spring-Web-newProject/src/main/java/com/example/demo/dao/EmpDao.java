package com.example.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.EmployeeBean;

import org.hibernate.query.Query;

@Repository
public class EmpDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public int addEmp(EmployeeBean eb)
	{
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		if(eb!=null)
		{
			
			s.persist(eb);
			t.commit();
			System.out.println("Session added/stored Successfully");
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int updateEmp(EmployeeBean eb)
	{
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		if(eb!=null)
		{
//			s.persist(String.valueOf(eb.getEid()),eb);
			s.merge(eb);
			t.commit();
			System.out.println("Session updated Successfully");
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int deleteEmp(int id)
	{
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		EmployeeBean e=(EmployeeBean)s.get(EmployeeBean.class, new Integer(id));
		if(e!=null)
		{
//			s.detach(e);
			s.remove(e);
			t.commit();
			System.out.println("session removed successfully");
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public List<EmployeeBean> selectAllEmp()
	{
		Session s=sessionFactory.openSession();
		List<EmployeeBean> all;
		Query q=s.createQuery("from EmployeeBean");
		all=q.list();
		return all;
	}
	

}
