package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.FlightBean;

@Repository
public class FlightDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addFlight(FlightBean fb)
	{
		return jdbcTemplate.update("Insert into flight555 values(?,?,?,?)",fb.getFlightId(),fb.getFlightName(),fb.getSeatingCapacity(),fb.getReservationCapacity());
	}
	
	public int updateFlight(FlightBean fb)
	{
		return jdbcTemplate.update("update flight555 set flightName=?,seatingCapacity=?,reservationCapacity=? where flightId=?",fb.getFlightName(),fb.getSeatingCapacity(),fb.getReservationCapacity(),fb.getFlightId());
	}
	
	public int deleteFlight(int id)
	{
		return jdbcTemplate.update("delete from flight555 where flightId=?",id);
	}
	public List<FlightBean> selectAll()
	{
		return jdbcTemplate.query("select * from flight555", new RowMapper<FlightBean>(){

			@Override
			public FlightBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				FlightBean fb=new FlightBean();
				fb.setFlightId(rs.getInt(1));
				fb.setFlightName(rs.getString(2));
				fb.setSeatingCapacity(rs.getInt(3));
				fb.setReservationCapacity(rs.getInt(4));
				return fb;
			}
			
		});
	}
	
	public List<FlightBean> selectBy(int id)
	{
		return jdbcTemplate.query("select * from flight555 where flightId=?", new RowMapper<FlightBean>() {

			@Override
			public FlightBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				FlightBean fb=new FlightBean();
				fb.setFlightId(rs.getInt(1));
				fb.setFlightName(rs.getString(2));
				fb.setSeatingCapacity(rs.getInt(3));
				fb.setReservationCapacity(rs.getInt(4));
				
				return fb;
			}
			
		},id);
	}
}
