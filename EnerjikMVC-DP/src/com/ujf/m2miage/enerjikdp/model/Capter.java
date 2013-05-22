package com.ujf.m2miage.enerjikdp.model;

import java.util.Collection;
import java.util.Iterator;


/***********************************************************************
 * Module:  Capter.java
 * Author:  Pa
 * Purpose: Defines the Class Capter
 ***********************************************************************/


public class Capter {

   private int id;

   private String description;

   private String localisation;
   
   private Collection<Measure> measure;
   
   private House house;
   
   private Equipement equipement;
   
   /**  default getter */
   public java.util.Collection<Measure> getMeasure() {
      if (measure == null)
         measure = new java.util.HashSet<Measure>();
      return measure;
   }
   
   /**  default iterator getter */
   @SuppressWarnings("rawtypes")
   public Iterator getIteratorMeasure() {
      if (measure == null)
         measure = new java.util.HashSet<Measure>();
      return measure.iterator();
   }
   
   /**  default setter
     * @param newMeasure */
   @SuppressWarnings("rawtypes")
   public void setMeasure(Collection<Measure> newMeasure) {
      removeAllMeasure();
      for (Iterator iter = newMeasure.iterator(); iter.hasNext();)
         addMeasure((Measure)iter.next());
   }
   
   /**  default add
     * @param newMeasure */
   public void addMeasure(Measure newMeasure) {
      if (newMeasure == null)
         return;
      if (this.measure == null)
         this.measure = new java.util.HashSet<Measure>();
      if (!this.measure.contains(newMeasure))
      {
         this.measure.add(newMeasure);
         newMeasure.setCapter(this);      
      }
   }
   
   /**  default remove
     * @param oldMeasure */
   public void removeMeasure(Measure oldMeasure) {
      if (oldMeasure == null)
         return;
      if (this.measure != null)
         if (this.measure.contains(oldMeasure))
         {
            this.measure.remove(oldMeasure);
            oldMeasure.setCapter((Capter)null);
         }
   }
   
   /**  default removeAll */
   @SuppressWarnings("rawtypes")
   public void removeAllMeasure() {
      if (measure != null)
      {
         Measure oldMeasure;
         for (Iterator iter = getIteratorMeasure(); iter.hasNext();)
         {
            oldMeasure = (Measure)iter.next();
            iter.remove();
            oldMeasure.setCapter((Capter)null);
         }
      }
   }
   /**  default parent getter */
   public House getHouse() {
      return house;
   }
   
   /**  default parent setter
     * @param newHouse */
   public void setHouse(House newHouse) {
      if (this.house == null || !this.house.equals(newHouse))
      {
         if (this.house != null)
         {
            House oldHouse = this.house;
            this.house = null;
            oldHouse.removeCapter(this);
         }
         if (newHouse != null)
         {
            this.house = newHouse;
            this.house.addCapter(this);
         }
      }
   }
   /**  default parent getter */
   public Equipement getEquipement() {
      return equipement;
   }
   
   /**  default parent setter
     * @param newEquipement */
   public void setEquipement(Equipement newEquipement) {
      if (this.equipement == null || !this.equipement.equals(newEquipement))
      {
         if (this.equipement != null)
         {
            Equipement oldEquipement = this.equipement;
            this.equipement = null;
            oldEquipement.removeCapter(this);
         }
         if (newEquipement != null)
         {
            this.equipement = newEquipement;
            this.equipement.addCapter(this);
         }
      }
   }

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getLocalisation() {
		return localisation;
	}
	
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	
	   
   
   
}