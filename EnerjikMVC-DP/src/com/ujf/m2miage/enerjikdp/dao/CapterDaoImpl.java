package com.ujf.m2miage.enerjikdp.dao;
import java.util.List;
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
	
	public void saveCapter(Capter capter){
		final String HOUSE_INSERT = "insert into HOUSE (HS_ID, HS_NAME)  "
				+ "values (?,?)";
		getJdbcTemplate()
				.update(HOUSE_INSERT,
						new Object[] {1,"houseTest"});
	}

	/**
	 * @see CapterDaoImpl.removeCapter
	 */
	public void removeCapter(Capter capter) {
	
		
	}

	public void updateCapter(Capter capter) {

	}

	public List<Capter> findCapterById(Integer idCapter) {

		return null;
	}

	public void saveHouse(House house) {
	
	}
}
