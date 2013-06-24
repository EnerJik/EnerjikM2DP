package com.ujf.m2miage.enerjikdp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ujf.m2miage.enerjikdp.model.Capter;
import com.ujf.m2miage.enerjikdp.model.Measure;

public class MeasureDaoImpl extends JdbcDaoSupport implements MeasureDao{

	@Override
	public void insertMeasure(Measure measure) {
		// TODO Auto-generated method stub
		final String MEASURE_INSERT = "insert into measure (MS_ID,MS_VALUE,MS_STATE,MS_DATE,CP_ID) "
				+ "values (?,?,?,?,?)";

		getJdbcTemplate()
				.update(MEASURE_INSERT,
						new Object[] { measure.getIdMeasure(), measure.getValue(), measure.isState(), measure.getDate(),measure.getIdCapter()});
	}

	@Override
	public Measure findMeasureById(Integer idMeasure) {
		// TODO Auto-generated method stub
		final String MEASURE_SELECT = "select MS_ID,MS_VALUE,MS_STATE,MS_DATE,CP_ID from EQUIPEMENT where MS_ID = ?";
		
		RowMapper<Measure> rowMapper = new RowMapper<Measure>() {
			public Measure mapRow(ResultSet rs, int rowNum) throws SQLException {
				Measure measure = new Measure();
				
				measure.setIdMeasure(rs.getInt("MS_ID"));
				measure.setValue(rs.getDouble("MS_VALUE"));
				measure.setState(rs.getBoolean("MS_STATE"));
				measure.setDate(rs.getDate("MS_DATE"));
				measure.setIdCapter(rs.getInt("CP_ID"));
				
				return measure;
			}
		};
		
		return (Measure) getJdbcTemplate().queryForObject(MEASURE_SELECT,
				new Object[] { Long.valueOf(idMeasure) }, rowMapper);
	}
}
