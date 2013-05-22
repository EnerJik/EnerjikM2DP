package com.ujf.m2miage.enerjikdp.model;

/***********************************************************************

 * Module:  Equipement.java
 * Author:  Pa
 * Purpose: Defines the Class Equipement
 ***********************************************************************/

import java.util.*;

public class Equipement {

   private int id;

   private String name;
 
   private String unity;
   
   private Collection<Capter> capter;
   
   public java.util.Collection<Capter> getCapter() {
      if (capter == null)
         capter = new java.util.HashSet<Capter>();
      return capter;
   }
   
   @SuppressWarnings("rawtypes")
public Iterator getIteratorCapter() {
      if (capter == null)
         capter = new java.util.HashSet<Capter>();
      return capter.iterator();
   }
   
   /**  default setter
     * @param newCapter */
   @SuppressWarnings("rawtypes")
public void setCapter(Collection<Capter> newCapter) {
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
         newCapter.setEquipement(this);      
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
            oldCapter.setEquipement((Equipement)null);
         }
   }
   
   /**default removeAll */
   @SuppressWarnings("rawtypes")
public void removeAllCapter() {
      if (capter != null)
      {
         Capter oldCapter;
         for (Iterator iter = getIteratorCapter(); iter.hasNext();)
         {
            oldCapter = (Capter)iter.next();
            iter.remove();
            oldCapter.setEquipement((Equipement)null);
         }
      }
   }

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public java.lang.String getName() {
		return name;
	}
	
	public void setName(java.lang.String name) {
		this.name = name;
	}

	public String getUnity() {
		return unity;
	}

	public void setUnity(String unity) {
		this.unity = unity;
	}
	   
}