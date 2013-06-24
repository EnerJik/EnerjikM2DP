package com.ujf.miage2.enerjik.dao;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ujf.m2miage.enerjikdp.webservice.ImportationService;

public class TestWebService {
	private static final Logger logger = Logger.getLogger(ImportationService.class);
	private  ImportationService importationService;
	
	public void setImportationService(ImportationService importationService) {
		this.importationService = importationService;
	}

	@Before
	public void setUp() throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] {
						"classpath:com/ujf/m2miage/enerjikdp/spring/configService2Tiers.xml"
		}) ;	
		importationService = applicationContext.getBean(ImportationService.class);
	}
	
	@Test
	public void mytest(){	
		logger.info("________________ yes");
		
	}
}
