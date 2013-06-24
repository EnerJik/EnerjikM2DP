package com.ujf.miage2.enerjik.dao;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ujf.m2miage.enerjikdp.service.SplitInfoService;


public class SplitServiceTest {
	
	private static final Logger logger = Logger.getLogger(SplitServiceTest.class);
	private  SplitInfoService splitInfoService;
	
	public void setSplitInfoService(SplitInfoService splitInfoService) {
		this.splitInfoService = splitInfoService;
	}

	@Before
	public void setUp() throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] {
						"classpath:com/ujf/m2miage/enerjikdp/spring/configService2Tiers.xml"
		}) ;	
		splitInfoService = applicationContext.getBean(SplitInfoService.class);
	}
	
	@Test
	public void mytest(){
		splitInfoService.testService();
		logger.info("________________ yes");
	}


}
