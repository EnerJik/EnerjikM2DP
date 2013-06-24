package com.ujf.m2miage.enerjikdp.model;

/***********************************************************************
 * Module:  Measure.java
 * Author:  Pa
 * Purpose: Defines the Class Measure
 ***********************************************************************/

import java.util.*;

public class Measure {
   
   private int idMeasure;
   
   private boolean state;
   
   private Date date;
   
   private Double value;
   
   private int idCapter;
   
   /** @pdGenerated default parent getter */
   public int getIdCapter() {
      return this.idCapter;
   }
   
   /** @pdGenerated default parent setter
     * @param newCapter */
   public void setIdCapter(int idCapter) {
      this.idCapter = idCapter;
   }

	public int getIdMeasure() {
		return this.idMeasure;
	}
	
	public void setIdMeasure(int idMeasure) {
		this.idMeasure = idMeasure;
	}
	
	public boolean isState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	   
}