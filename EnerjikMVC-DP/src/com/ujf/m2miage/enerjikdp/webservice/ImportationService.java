package com.ujf.m2miage.enerjikdp.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.ujf.m2miage.enerjikdp.beans.DirectoryInformation;
import com.ujf.m2miage.enerjikdp.beans.FileHandler;

@Component
@WebService
public interface ImportationService {
	
	/**
	 * service to upload one file to the database  
	 * we use FileHandler to store information to optimize the time of upload 
	 * @param fileHandler: description of the file, file to uploaded
	 */
	@WebMethod
	public void uploadFileHandler(@WebParam FileHandler fileHandler);
	
	/**
	 * service to upload many files to the database
	 * @param fileHandlers, list of FileHandler to upload
	 */
	@WebMethod
	public void uploadFileHandlers(@WebParam List<FileHandler> fileHandlers);
	
	/**
	 * service to upload many files store in directory
	 * @param directoryInformation description of the directory
	 */
	@WebMethod
	public void importFilesInDirectory(@WebParam DirectoryInformation directoryInformation);
	
}
