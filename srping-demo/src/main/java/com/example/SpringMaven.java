package com.example;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//
//import com.example.bean.EmpBean;
//import com.example.service.EmpService;
//
//@SpringBootApplication
//public class SpringMaven {
//	public static void main(String[] args) {
////		SpringApplication.run(SpringMaven.class, args);
////		System.out.println("Welcome");
//		
//		ConfigurableApplicationContext ctx=SpringApplication.run(SpringMaven.class, args);
////		Bean b=ctx.getBean(Bean.class);
//		EmpBean b=(EmpBean) ctx.getBean(EmpBean.class);
//		EmpService es=ctx.getBean(EmpService.class);
//		b.setEid(1);
//		b.setName("PK");
//		b.setEsal(30000);
//		System.out.println(es.addEmployee(b)+"Recoed Added Successfully");
//		
//		
////		EmpBean b1=ctx.getBean(EmpBean.class);
////		b1.setEid(2);
////		b1.setName("PA");
////		b1.setEsal(35000);
////		System.out.println(es.addEmployee(b1)+"Recoed Added Successfully");
//	}
//
//}

import java.util.ArrayList;



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;



import com.example.bean.EmpBean;

import com.example.service.EmpService;



@SpringBootApplication

public class SpringMaven {

public static void main(String[] args) {

ConfigurableApplicationContext ctx=SpringApplication.run(SpringMaven.class, args);

EmpBean eb=(EmpBean)ctx.getBean("eb");

	EmpService eserv=(EmpService)ctx.getBean(EmpService.class);

System.out.println(eserv.deleteEmployee(101)+" record deleted successfully...");

		eb.setEid(101);

	eb.setName("Karthik");

	eb.setEsal(55000);

	System.out.println(eserv.updateEmployee(eb)+" record updated successfully...");

// ArrayList<EmployeeBean> all= eserv.selectAll();

//	for(EmployeeBean e:all)

//	{

// System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal());

//	}

	

//EmpBean e=eserv.selectById(102);
//
//System.out.println(e);

}

}
