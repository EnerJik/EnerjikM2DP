package com.ujf.m2miage.enerjikdp.beans;

import java.io.Serializable;


public class FileHandler implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3460917303112628025L;
	private byte[] data;
	private String name;

	public FileHandler() {
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}