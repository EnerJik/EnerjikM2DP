package com.ujf.m2miage.enerjikdp.service;

import java.io.InputStream;

import com.ujf.m2miage.enerjikdp.model.Capter;

public interface SplitInfoService {
	/**
	 * Split all informations from the file and add their into database
	 * @param ips
	 */
	public void splitFile(InputStream ips);
	
	public String testService();
	
	public void saveCapter(Capter capter);
  
}
