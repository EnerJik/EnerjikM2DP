package com.ujf.m2miage.enerjikdp.controleur;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GraphController {
	@RequestMapping("/graphCoso.action")
	public String showGraph(Map<String,Object> model) {
		return "graph";
	}
}
