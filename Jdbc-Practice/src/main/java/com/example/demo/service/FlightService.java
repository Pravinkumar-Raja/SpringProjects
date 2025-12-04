package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.FlightBean;
import com.example.demo.dao.FlightDao;

@Service
public class FlightService {

	@Autowired
	private FlightDao fdao;
	
	public String addFlight(FlightBean fb)
	{
		return fdao.addFlight(fb)+" record added";
	}
	public String updateFlight(FlightBean fb)
	{
		return fdao.updateFlight(fb)+" record updated";
	}
	public String deleteFlight(int id)
	{
		return fdao.deleteFlight(id)+" deleted successfully";
	}
	public List<FlightBean> selectAll()
	{
		List<FlightBean> l=new ArrayList<>();
		l.addAll(fdao.selectAll());
		return l;
	}
	public List<FlightBean> selectBy(int id)
	{
		List<FlightBean> l=new ArrayList<>();
		l.addAll(fdao.selectBy(id));
		return l;
	}
}
