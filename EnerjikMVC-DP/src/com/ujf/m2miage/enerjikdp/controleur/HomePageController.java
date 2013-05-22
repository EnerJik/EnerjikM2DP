package com.ujf.m2miage.enerjikdp.controleur;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ujf.m2miage.enerjikdp.service.SplitInfoService;

@Controller
public class HomePageController {
	
	/*
	 * INJECTION Spring d'un bean Service dans le controleur. 
	 */
	private SplitInfoService splitInfoService;
	
	/*
	 * Meilleure pratique Spring 3 : 
	 * utilisation d'Annotations et controlleur faiblement couplé à Spring 
	 */
	@RequestMapping({"/","/home"})
	public String homePage(Map<String,Object> model) {
		System.out.println(" --------------"+splitInfoService.testService());
		return "home";
	}
	
	@RequestMapping("/listeEmployes")
	public String listeEmployes(Map<String,Object> model) {
		/*
		 * Lancement du Service et récupération données en base
		 */
		//model.put ("employes", employeManager.getAllEmployes());
		/*
		 * Envoi Vue + Modèle MVC pour Affichage données vue
		 */
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
