package com.example.dao;

//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//import com.example.bean.EmpBean;
//
//@Repository
//public class EmployeeDao {
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	public int addEmployee(EmpBean eb)
//	{
//		return jdbcTemplate.update("insert into EmployeeDetails values('"+eb.getEid()+"','"+eb.getName()+"','"+eb.getEsal()+"')");
//	}
//	
//	public ArrayList<EmpBean> selectAll()
//	{
//		ArrayList<EmpBean> emp = new ArrayList();
//		jdbcTemplate.query("Select * from EmployeeDetails",new RowMapper<EmpBean>()
//		{
//			@Override
//			public EmpBean mapRow(ResultSet rs, int rowNum)throws SQLException{
//				EmpBean e=new EmpBean();
//				e.setEid(rs.getInt(1));
//				e.setName(rs.getString(2));
//				e.setEsal(rs.getInt(3));
//				emp.add(e);
//				return e;
//			}
//		});
//		return emp;
//		
//		
//	}
//	
//
//}



import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Repository;

import com.example.bean.EmpBean;
import com.example.bean.EmpBean;



@Repository

public class EmployeeDao {

@Autowired

private JdbcTemplate jdbcTemplate;

public int addEmployee(EmpBean eb)

{

return jdbcTemplate.update("insert into employee values('"+eb.getEid()+"','"+eb.getName()+"','"+eb.getEsal()+"')");

}



public int updateEmployee(EmpBean eb)

{

return jdbcTemplate.update("update employee set name='"+eb.getName()+"',salary='"+eb.getEsal()+"' where id='"+eb.getEid()+"'");

}

public int deleteEmployee(int id)

{

return jdbcTemplate.update("delete from employee where id="+id);

}

public ArrayList<EmpBean> selectAll()

{

ArrayList<EmpBean> al=new ArrayList<EmpBean>();

jdbcTemplate.query("select * from employee", new RowMapper<EmpBean>() {



@Override

 public EmpBean mapRow(ResultSet rs, int rowNum) throws SQLException {

EmpBean e=new EmpBean();

e.setEid(rs.getInt(1));

e.setName(rs.getString(2));

e.setEsal(rs.getInt("salary"));

al.add(e);

return e;

}



});

return al;

}

public EmpBean selectById(int id)

{

EmpBean e=new EmpBean();

jdbcTemplate.query("select * from employee where id="+id, new RowMapper<EmpBean>() {



@Override

 public EmpBean mapRow(ResultSet rs, int rowNum) throws SQLException {

e.setEid(rs.getInt(1));

e.setName(rs.getString(2));

e.setEsal(rs.getInt(3));

return e;

}



});

return e;

}

}