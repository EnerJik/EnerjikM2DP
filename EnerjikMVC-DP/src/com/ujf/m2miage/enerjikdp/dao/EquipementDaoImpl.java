package com.ujf.m2miage.enerjikdp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ujf.m2miage.enerjikdp.model.Capter;
import com.ujf.m2miage.enerjikdp.model.Equipement;

public class EquipementDaoImpl extends JdbcDaoSupport implements EquipementDao {

	@Override
	public Equipement findEquipementById(Integer idEquipement) {
		// TODO Auto-generated method stub
		final String EQUIPEMENT_SELECT = "select EQ_ID, EQ_NAME, HS_ID from EQUIPEMENT where EQ_ID = ?";
		
		RowMapper<Equipement> rowMapper = new RowMapper<Equipement>() {
			public Equipement mapRow(ResultSet rs, int rowNum) throws SQLException {
				Equipement equipement = new Equipement();
				
				equipement.setIdEquipement(rs.getInt("EQ_ID"));
				equipement.setName(rs.getString("EQ_NAME"));
				equipement.setIdHouse(rs.getInt("HS_ID"));
				
				return equipement;
			}
		};
		
		return (Equipement) getJdbcTemplate().queryForObject(EQUIPEMENT_SELECT,
				new Object[] { Long.valueOf(idEquipement) }, rowMapper);
	}
	

	@Override
	public void insertEquipement(Equipement equipement) {
		// TODO Auto-generated method stub
		final String EQUIPEMENT_INSERT = "insert into equipement (EQ_ID,EQ_NAME,HS_ID) "
				+ "values (?,?,?)";

		getJdbcTemplate()
				.update(EQUIPEMENT_INSERT,
						new Object[] { equipement.getIdEquipement(),equipement.getName(),equipement.getIdHouse() });
	}


	@Override
	public Equipement findEquipementByName(String name) {
		// TODO Auto-generated method stub
		final String EQUIPEMENT_SELECT = "select EQ_ID, EQ_NAME, HS_ID from EQUIPEMENT where EQ_NAME = ?";
		
		RowMapper<Equipement> rowMapper = new RowMapper<Equipement>() {
			public Equipement mapRow(ResultSet rs, int rowNum) throws SQLException {
				Equipement equipement = new Equipement();
				
				equipement.setIdEquipement(rs.getInt("EQ_ID"));
				equipement.setName(rs.getString("EQ_NAME"));
				equipement.setIdHouse(rs.getInt("HS_ID"));
				
				return equipement;
			}
		};
		
		return (Equipement) getJdbcTemplate().queryForObject(EQUIPEMENT_SELECT,
				new Object[] { String.valueOf(name) }, rowMapper);
	}
}
