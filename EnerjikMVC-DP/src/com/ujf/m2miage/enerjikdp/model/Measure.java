package com.ujf.m2miage.enerjikdp.model;

/***********************************************************************
 * Module:  Measure.java
 * Author:  Pa
 * Purpose: Defines the Class Measure
 ***********************************************************************/

import java.util.*;

public class Measure {
   
   private int id;
   
   private boolean state;
   
   private Date date;
   
   private Double value;
   
   private Capter capter;
   
   /** @pdGenerated default parent getter */
   public Capter getCapter() {
      return capter;
   }
   
   /** @pdGenerated default parent setter
     * @param newCapter */
   public void setCapter(Capter newCapter) {
      if (this.capter == null || !this.capter.equals(newCapter))
      {
         if (this.capter != null)
         {
            Capter oldCapter = this.capter;
            this.capter = null;
            oldCapter.removeMeasure(this);
         }
         if (newCapter != null)
         {
            this.capter = newCapter;
            this.capter.addMeasure(this);
         }
      }
   }

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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