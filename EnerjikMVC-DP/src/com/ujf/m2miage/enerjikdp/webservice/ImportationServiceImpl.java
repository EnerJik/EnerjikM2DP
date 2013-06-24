package com.ujf.m2miage.enerjikdp.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import com.ujf.m2miage.enerjikdp.beans.DirectoryInformation;
import com.ujf.m2miage.enerjikdp.beans.FileHandler;


/**
 * @author Patrice
 */
@WebService(endpointInterface="com.ujf.m2miage.enerjikdp.webservice.ImportationService")
public class ImportationServiceImpl implements ImportationService{
	Logger logger = Logger.getLogger(ImportationService.class);
	

	@Override
	@WebMethod
	public void uploadFileHandler(@WebParam FileHandler fileHandler) {
		logger.info("_____________fileHandler:"+fileHandler.getName());
	}

	@Override
	@WebMethod
	public void uploadFileHandlers(@WebParam List<FileHandler> fileHandlers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@WebMethod
	public void importFilesInDirectory(
			@WebParam DirectoryInformation directoryInformation) {
		// TODO Auto-generated method stub
		
	}
	
}
