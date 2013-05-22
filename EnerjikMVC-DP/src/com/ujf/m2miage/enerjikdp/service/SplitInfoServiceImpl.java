package com.ujf.m2miage.enerjikdp.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Set;

import com.ujf.m2miage.enerjikdp.dao.CapterDao;
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
		
		House house = new House();
		Equipement equip = new Equipement();
		Capter capter = new Capter();
		Measure measure = new Measure();
		
		Set<Measure> listMeasure = null;
		
		String nomProjet="";
		String paysProjet="";
		
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
				if(i==0){
					nomProjet = ligne.split("PROJECT : | \\([A-Za-z0-9]*\\)")[1].trim();
					paysProjet = ligne.split("\\(|\\)")[1].trim();
				}
				else if(i==1){
					house.setName(ligne.split("HOUSEHOLD : ")[1].trim());
					capter.setHouse(house);
				}
				else if(i==2){
					equip.setName(ligne.split("APPLIANCE : | \\([A-Za-z0-9]*\\)")[1].trim());
					capter.setEquipement(equip);
				}
				else if(i==4){
					equip.setUnity(ligne.split("\\(|\\)")[5].trim());
				}
				else if(i>4){
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
					measure.setCapter(capter);
					listMeasure.add(measure);
				}
				i++;
			}
			capter.setMeasure(listMeasure);
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	}

	@Override
	public void saveCapter(Capter capter) {
		capterDao.saveCapter(capter);
		
	}
	
}
