package com.ujf.m2miage.enerjikdp.beans;

import java.io.Serializable;

public class DirectoryInformation implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6520319998047846736L;

	/**
	 * the directory pat wich store the file to upload
	 */
	private String directoryPath;
	
	/**
	 * file extension to upload 
	 */
	private String fileExtension;
	
	public DirectoryInformation() {
		super();
	}

	public String getDirectoryPath() {
		return directoryPath;
	}

	public void setDirectoryPath(String directoryPath) {
		this.directoryPath = directoryPath;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	
	
	
}
