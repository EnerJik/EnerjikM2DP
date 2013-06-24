package com.ujf.m2miage.enerjikdp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ujf.m2miage.enerjikdp.model.Capter;
import com.ujf.m2miage.enerjikdp.model.House;

public class HouseDaoImpl extends JdbcDaoSupport implements HouseDao{

	@Override
	public House findHouseById(Integer idHouse) {
		// TODO Auto-generated method stub
		final String HOUSE_SELECT = "select HS_ID,HS_NAME from HOUSE where HS_ID = ?";
		
		RowMapper<House> rowMapper = new RowMapper<House>() {
			public House mapRow(ResultSet rs, int rowNum) throws SQLException {
				House house = new House();
				
				if(rs.next()){
					house.setIdHouse(rs.getInt("HS_ID"));
					house.setName(rs.getString("HS_NAME"));
				}
				
				return house;
			}
		};
		
		return (House) getJdbcTemplate().queryForObject(HOUSE_SELECT,
				new Object[] { Long.valueOf(idHouse) }, rowMapper);
	}
	
	

	@Override
	public void insertHouse(House house) {
		final String HOUSE_INSERT = "insert into equipement (HS_ID,HS_NAME) "
				+ "values (?,?)";

		getJdbcTemplate()
				.update(HOUSE_INSERT,
						new Object[] { house.getIdHouse(), house.getName() });
	}



	@Override
	public House findHouseByName(String name) {
		// TODO Auto-generated method stub
		final String HOUSE_SELECT = "select HS_ID,HS_NAME from HOUSE where HS_NAME = ?";
		
		RowMapper<House> rowMapper = new RowMapper<House>() {
			public House mapRow(ResultSet rs, int rowNum) throws SQLException {
				House house = new House();
				
				if(rs.next()){
					house.setIdHouse(rs.getInt("HS_ID"));
					house.setName(rs.getString("HS_NAME"));
				}
				return house;
			}
		};
		
		return (House) getJdbcTemplate().queryForObject(HOUSE_SELECT,
				new Object[] { String.valueOf(name) }, rowMapper);
	}

}
