package com.ujf.m2miage.enerjikdp.controleur;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ujf.m2miage.enerjikdp.service.SplitInfoService;

@Controller
public class HomePageController {
	
	/*
	 * INJECTION Spring d'un bean Service dans le controleur. 
	 */
	private SplitInfoService splitInfoService;

	@RequestMapping({"/","/home"})
	public String homePage(Model model) {
		return "home";
	}
	
	@RequestMapping("/listeEmployes")
	public String listeEmployes(Map<String,Object> model) {
		return "listeEmployes";
	}

	@RequestMapping("/addTestData")
	public String saveTestData(Map<String,Object> model) {
		splitInfoService.saveCapter(null);
		return "home";
	}
	
	@Autowired
	public void setSplitInfoService(SplitInfoService splitInfoService) {
		this.splitInfoService = splitInfoService;
	}
	
	
}
