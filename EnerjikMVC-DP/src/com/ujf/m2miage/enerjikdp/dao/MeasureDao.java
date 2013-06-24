package com.ujf.m2miage.enerjikdp.dao;

import java.util.List;

import com.ujf.m2miage.enerjikdp.model.Measure;

public interface MeasureDao {
	
	public Measure findMeasureById (Integer idMeasure);

	void insertMeasure(Measure measure);
	
}
