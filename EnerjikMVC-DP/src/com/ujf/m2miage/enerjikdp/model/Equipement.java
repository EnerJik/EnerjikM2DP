package com.ujf.m2miage.enerjikdp.model;

/***********************************************************************

 * Module:  Equipement.java
 * Author:  Pa
 * Purpose: Defines the Class Equipement
 ***********************************************************************/

import java.util.*;

public class Equipement {

	private String name;
	   
	private int idEquipement;
	   
	private int idHouse;
   
	public Equipement(String name, int idEquipement, int idHouse) {
		super();
		this.name = name;
		this.idEquipement = idEquipement;
		this.idHouse = idHouse;
	}
	
	public Equipement(){
		
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getIdEquipement() {
		return idEquipement;
	}

	public void setIdEquipement(int idEquipement) {
		this.idEquipement = idEquipement;
	}

	public int getIdHouse() {
		return idHouse;
	}

	public void setIdHouse(int idHouse) {
		this.idHouse = idHouse;
	}
}