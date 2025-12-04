package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.FlightBean;
import com.example.demo.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {
@Autowired
private FlightService flightService;

@PostMapping("/addFlight")
public String meth1(@RequestBody FlightBean fb)
{
	return "<h1>"+flightService.addFlight(fb)+"</h1>";
}
@PostMapping("/updateFlight")
public String meth2(@RequestBody FlightBean fb)
{
	return "<h1>"+flightService.updateFlight(fb)+"</h1>";
}
@DeleteMapping("/deleteFlight")
public String meth3(@RequestBody int id)
{
	return "<h1>"+flightService.deleteFlight(id)+"</h1>";
}
@GetMapping("/selectAll")
public List<FlightBean> meth4()
{
	List<FlightBean> l=new ArrayList<>();
	l.addAll(flightService.selectAll());
	return l;
}
@GetMapping("/selectBy")
public List<FlightBean> meth5(@RequestBody int id)
{
	List<FlightBean> l=new ArrayList<>();
	l.addAll(flightService.selectBy(id));
	return l;
}
}
