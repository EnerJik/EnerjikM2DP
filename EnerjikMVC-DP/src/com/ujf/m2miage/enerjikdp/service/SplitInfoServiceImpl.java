package com.ujf.m2miage.enerjikdp.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Set;

import com.ujf.m2miage.enerjikdp.dao.CapterDao;
import com.ujf.m2miage.enerjikdp.dao.CapterDaoImpl;
import com.ujf.m2miage.enerjikdp.dao.EquipementDao;
import com.ujf.m2miage.enerjikdp.dao.EquipementDaoImpl;
import com.ujf.m2miage.enerjikdp.dao.HouseDao;
import com.ujf.m2miage.enerjikdp.dao.HouseDaoImpl;
import com.ujf.m2miage.enerjikdp.model.Capter;
import com.ujf.m2miage.enerjikdp.model.Equipement;
import com.ujf.m2miage.enerjikdp.model.House;
import com.ujf.m2miage.enerjikdp.model.Measure;

public class SplitInfoServiceImpl implements SplitInfoService{

	private CapterDao capterDao;
	
	public void setCapterDao(CapterDao capterdao){
		this.capterDao = capterdao;
	}
	
	public String testService(){
		//return "___________________________ SERVICE 888888888888888888";
		return capterDao.testDao();
	}
	
	public void splitFile(InputStream ips) {
		// TODO Auto-generated method stub
		System.out.println("sqdqsdqsdqsdqsdqsd_____________");
		//Instanciation des services dao
		HouseDao hd = new HouseDaoImpl(); 
		EquipementDao ed = new EquipementDaoImpl();
		CapterDao cd = new CapterDaoImpl();
		
		House house = new House();
		Equipement equip = new Equipement();
		Capter capter = new Capter();
		Measure measure = new Measure();
		
		Set<Measure> listMeasure = null;
		
		String houseName ="";
		String equipementName = "";
		
		String date="";
		String heure="";
		String etat="";
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy hh:mm");
		
		try{ 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			
			String ligne;
			int i = 0;
			
			while ((ligne=br.readLine())!=null){
				
				switch (i){
					case 0 :
						//nomProjet = ligne.split("PROJECT : | \\([A-Za-z0-9]*\\)")[1].trim();
						//paysProjet = ligne.split("\\(|\\)")[1].trim();
						break;
					case 1 :
						houseName = ligne.split("HOUSEHOLD : ")[1].trim();
						House h = hd.findHouseByName(houseName);
						if(h == null){
							house.setName(houseName);
							hd.insertHouse(house);
						}
						break;
					case 2 :
						equipementName = ligne.split("APPLIANCE : | \\([A-Za-z0-9]*\\)")[1].trim();
						Equipement e = ed.findEquipementByName(equipementName);
						
						if(e == null){
							equip.setIdHouse(hd.findHouseByName(houseName).getIdHouse());
							equip.setName(equipementName);
							ed.insertEquipement(equip);
						}
						capter.setIdEquipement(ed.findEquipementByName(equipementName).getIdEquipement());
						cd.insertCapter(capter);
						
						break;
					case 3 :
						break;
					case 4 :
						//equip.setUnity(ligne.split("\\(|\\)")[5].trim());
						break;
					default :
						if(i>4){
							date = ligne.split("\t")[0].trim();
							heure = ligne.split("\t")[1].trim();
							measure.setDate(dateFormat.parse(date+" "+heure));
							etat = ligne.split("\t")[2].trim();
							if(Integer.parseInt(etat) == 0){
								measure.setState(false);
							}
							else if(Integer.parseInt(etat) == 1){
								measure.setState(true);
							}
							else{ 
								measure.setState(false);
							}
							measure.setValue(Double.parseDouble(ligne.split("\t")[3].trim()));
							measure.setIdCapter(1); //<-- Comment faire pour connaitre l'ID du capteur ???
						}
						break;
				}
				i++;
			}
			br.close();
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
	}

	@Override
	public void saveCapter(Capter capter) {
		
	}
}