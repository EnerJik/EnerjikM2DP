package com.ujf.m2miage.enerjikdp.dao;

import java.util.List;

import com.ujf.m2miage.enerjikdp.model.Equipement;

public interface EquipementDao {
	public Equipement findEquipementById (Integer idEquipement);
	
	public Equipement findEquipementByName (String name);

	
	public void insertEquipement (Equipement equipement);
}
