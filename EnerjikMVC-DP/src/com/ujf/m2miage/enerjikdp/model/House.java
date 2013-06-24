package com.ujf.m2miage.enerjikdp.model;
/***********************************************************************
 * Module:  House.java
 * Author:  Pa
 * Purpose: Defines the Class House
 ***********************************************************************/

import java.util.*;

public class House {
   
   public int idHouse;
   
   public String name;
   
   public House (int idHouse, String name){
	   this.idHouse = idHouse;
	   this.name = name;
   }
   
   public House(){
	   
   }

   public int getIdHouse() {
	   return idHouse;
   }
	
   public void setIdHouse(int idHouse) {
		this.idHouse = idHouse;
   }
	
	public java.lang.String getName() {
		return name;
	}
	
	public void setName(java.lang.String name) {
		this.name = name;
	}
}