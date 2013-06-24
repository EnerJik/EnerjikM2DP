package com.ujf.m2miage.enerjikdp.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ujf.m2miage.enerjikdp.model.Capter;
import com.ujf.m2miage.enerjikdp.model.House;

/**
 * @author Patrice
 */
public class CapterDaoImpl extends JdbcDaoSupport implements CapterDao{

	public String testDao(){
		return "OK";
	}
	
	public void insertCapter(Capter capter){
		final String CAPTER_INSERT = "insert into capter (CP_ID,EQ_ID) "
				+ "values (?,?)";

		getJdbcTemplate()
				.update(CAPTER_INSERT,
						new Object[] { capter.getIdCapter(), capter.getIdEquipement() });
	}

	/**
	 * @see CapterDaoImpl.removeCapter
	 */
	public void removeCapter(Capter capter) {

	}

	public void updateCapter(Capter capter) {

	}

	public Capter findCapterById(Integer idCapter) {
		
		final String CAPTER_SELECT = "select CP_ID, EQ_ID from Capter where CP_ID = ?";
		
		RowMapper<Capter> rowMapper = new RowMapper<Capter>() {
			public Capter mapRow(ResultSet rs, int rowNum) throws SQLException {
				Capter capter = new Capter();
				
				capter.setIdCapter(rs.getInt("CP_ID"));
				capter.setIdEquipement(rs.getInt("EQ_ID"));
				
				return capter;
			}
		};
		
		return (Capter) getJdbcTemplate().queryForObject(CAPTER_SELECT,
				new Object[] { Long.valueOf(idCapter) }, rowMapper);

	}
}