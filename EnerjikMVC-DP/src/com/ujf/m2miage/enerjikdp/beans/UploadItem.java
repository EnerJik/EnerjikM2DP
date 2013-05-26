package com.ujf.m2miage.enerjikdp.beans;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 *
 * @author ENERJIK-DP 
 */
public class UploadItem
{
  
	/**
	 * name file
	 */
	private String name;
	
	/**
	 * file data
	 */
  	private CommonsMultipartFile fileData;

	  public String getName()
	  {
	    return name;
	  }
	
	  public void setName(String name)
	  {
	    this.name = name;
	  }
	
	  public CommonsMultipartFile getFileData()
	  {
	    return fileData;
	  }
	
	  public void setFileData(CommonsMultipartFile fileData)
	  {
	    this.fileData = fileData;
	  }
}
