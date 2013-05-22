package com.ujf.m2miage.enerjikdp.model;
/***********************************************************************
 * Module:  House.java
 * Author:  Pa
 * Purpose: Defines the Class House
 ***********************************************************************/

import java.util.*;

public class House {
   
   public double id;
   
   public java.lang.String name;
   
   public java.util.Collection<Capter> capter;
   
   /**  default getter */
   public java.util.Collection<Capter> getCapter() {
      if (capter == null)
         capter = new java.util.HashSet<Capter>();
      return capter;
   }
   
   /**  default iterator getter */
   @SuppressWarnings("rawtypes")
   public Iterator getIteratorCapter() {
      if (capter == null)
         capter = new java.util.HashSet<Capter>();
      return capter.iterator();
   }
   
   /**  default setter
     * @param newCapter */
   @SuppressWarnings("rawtypes")
   public void setCapter(java.util.Collection<Capter> newCapter) {
      removeAllCapter();
      for (Iterator iter = newCapter.iterator(); iter.hasNext();)
         addCapter((Capter)iter.next());
   }
   
   /**  default add
     * @param newCapter */
   public void addCapter(Capter newCapter) {
      if (newCapter == null)
         return;
      if (this.capter == null)
         this.capter = new java.util.HashSet<Capter>();
      if (!this.capter.contains(newCapter))
      {
         this.capter.add(newCapter);
         newCapter.setHouse(this);      
      }
   }
   
   /**  default remove
     * @param oldCapter */
   public void removeCapter(Capter oldCapter) {
      if (oldCapter == null)
         return;
      if (this.capter != null)
         if (this.capter.contains(oldCapter))
         {
            this.capter.remove(oldCapter);
            oldCapter.setHouse((House)null);
         }
   }
   
   /**  default removeAll */
   @SuppressWarnings("rawtypes")
   public void removeAllCapter() {
      if (capter != null)
      {
         Capter oldCapter;
         for (java.util.Iterator iter = getIteratorCapter(); iter.hasNext();)
         {
            oldCapter = (Capter)iter.next();
            iter.remove();
            oldCapter.setHouse((House)null);
         }
      }
   }

	public double getId() {
		return id;
	}
	
	public void setId(double id) {
		this.id = id;
	}
	
	public java.lang.String getName() {
		return name;
	}
	
	public void setName(java.lang.String name) {
		this.name = name;
	}
	   

}