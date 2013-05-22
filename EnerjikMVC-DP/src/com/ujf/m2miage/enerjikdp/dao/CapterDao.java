package com.ujf.m2miage.enerjikdp.dao;
import java.util.List;

import com.ujf.m2miage.enerjikdp.model.Capter;

/**
 * @author Patrice
 * interface to persist or select capter object
 */
public interface CapterDao {
	
	public String testDao();

	/**
	 * save capter in bdd
	 * @param capter
	 */
	public void saveCapter(Capter capter);

	
	/**
	 * remove capter in bdd
	 * @param capter to remove
	 */
	public void removeCapter(Capter capter);
	

	/**
	 * update capter in bdd
	 * @param capter to update
	 */
	public void updateCapter(Capter capter);
	
	/**
	 * find capter by id
	 * @param idCapter: id capter
	 * @return list of capter with id in parameter
	 */
	public List<Capter> findCapterById(Integer idCapter);
	
}
