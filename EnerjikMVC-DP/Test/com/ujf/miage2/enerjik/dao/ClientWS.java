package com.ujf.miage2.enerjik.dao;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import org.apache.commons.io.IOUtils;
import com.ujf.m2miage.enerjikdp.beans.FileHandler;
import com.ujf.m2miage.enerjikdp.webservice.ImportationService;

public class ClientWS {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
			 
		//boolean mtom = false;
		URL url = new URL("http://localhost:8081/webservices/importationServiceImpl?WSDL");
		 
		QName qname = new QName("http://webservice.enerjikdp.m2miage.ujf.com/", "ImportationServiceImplService");	 
       
		Service service = Service.create(url, qname); 
		
        ImportationService importationService = service.getPort(ImportationService.class);
        
        upload(importationService);
        
        System.out.println(" DONE !");
	}
	
       
	public static void upload(ImportationService importationService) {
		
		String filePath = "D:/03_Projets/Tmp/upload/test.txt";
    	InputStream ins = null;
  
    	try {    		
    		ins = new FileInputStream(filePath);
    		FileHandler fileHandler = new FileHandler();
    		fileHandler.setData(IOUtils.toByteArray(ins));
    		fileHandler.setName("factureViawebServiceTest2.pdf");  
    		
    		importationService.uploadFileHandler(fileHandler);
    		
    		System.out.println("insert terminé");
    		ins.close(); 		
    		
		} catch (IOException ioe) {
			System.out.println(ioe);
		}finally {
			try {
				if (ins != null) {
					System.out.println("closing file");
					ins.close();
				}
			} catch (IOException ie) {
				System.out.println(ie);
				System.out.println("erreur while closing");
			}
		}
	}
}

