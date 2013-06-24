package com.ujf.m2miage.enerjikdp.dao;

import java.util.List;

import com.ujf.m2miage.enerjikdp.model.House;

public interface HouseDao {
	
	public void insertHouse(House house);
	
	public House findHouseById (Integer idHouse);
	
	public House findHouseByName(String name);
}
