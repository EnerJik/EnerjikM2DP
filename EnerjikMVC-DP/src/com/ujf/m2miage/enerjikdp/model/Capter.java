package com.ujf.m2miage.enerjikdp.model;

import java.util.Collection;
import java.util.Iterator;


/***********************************************************************
 * Module:  Capter.java
 * Author:  Pa
 * Purpose: Defines the Class Capter
 ***********************************************************************/


public class Capter {

	private int idCapter;
	   
	private int idEquipement;

	public Capter(int idCapter, int idEquipement) {
		super();
		this.idCapter = idCapter;
		this.idEquipement = idEquipement;
	}
	
	public Capter(){
		
	}

	public int getIdCapter() {
		return idCapter;
	}

	public void setIdCapter(int idCapter) {
		this.idCapter = idCapter;
	}

	public int getIdEquipement() {
		return idEquipement;
	}

	public void setIdEquipement(int idEquipement) {
		this.idEquipement = idEquipement;
	}
}