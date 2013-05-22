package com.ujf.m2miage.enerjikdp.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcEmployeDaoSupport extends JdbcDaoSupport{

	/*public void saveEmploye(Employe employe) {

		final String EMPLOYE_INSERT = "insert into employe (id,login, password, prenom, nom, email, role) "
				+ "values (?,?,?,?,?,?,?)";

		
		getJdbcTemplate()
				.update(EMPLOYE_INSERT,
						new Object[] { employe.getId(), employe.getLogin(),
								employe.getPassword(), employe.getPrenom(),
								employe.getNom(), employe.getEmail(),
								employe.getRole() });
	}

	// @SuppressWarnings("unchecked")
	public List<Employe> getAllEmployes() {

		final String ALL_EMPLOYE = "select * from employe";

		RowMapper<Employe> rowMapper = new RowMapper<Employe>() {
			public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employe employe = new Employe();
				employe.setEmail(rs.getString("email"));
				employe.setId(rs.getInt("id"));
				employe.setLogin(rs.getString("login"));
				employe.setPassword(rs.getString("password"));
				employe.setRole(rs.getString("role"));
				employe.setNom(rs.getString("nom"));
				employe.setPrenom(rs.getString("prenom"));
				return employe;
			}
		};

		List<Employe> allEmployes = getJdbcTemplate().query(ALL_EMPLOYE,
				rowMapper);

		return allEmployes;
	}

	public Employe getEmployeById(int id) {

		String sql = "select id, nom, prenom from employe where id = ?";

		// Mapping d'un enregistrement vers un ResultSet
		RowMapper<Employe> mapper = new RowMapper<Employe>() {
			public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employe employe = new Employe();
				employe.setId((int) rs.getLong("id"));
				employe.setNom(rs.getString("nom"));
				employe.setPrenom(rs.getString("prenom"));
				return employe;
			}

		};

		return (Employe) getJdbcTemplate().queryForObject(sql,
				new Object[] { Long.valueOf(id) }, mapper);

	}

	public Employe getEmployeByLogin(String login) {
		// TODO recup�ration d'un employ� en fonction de son Id

		String sql = "select login, nom, prenom, email from employe where login = ?";

		// Mapping d'un enregistrement vers un ResultSet
		RowMapper<Employe> mapper = new RowMapper<Employe>() {
			public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employe employe = new Employe();
				employe.setLogin((String) rs.getString("login"));
				employe.setNom(rs.getString("nom"));
				employe.setPrenom(rs.getString("prenom"));
				employe.setEmail(rs.getString("email"));
				return employe;
			}

		};

		return (Employe) getJdbcTemplate().queryForObject(sql,
				new Object[] { String.valueOf(login) }, mapper);

	}

	public int getEmployesCount() {
		final String EMPLOYE_COUNT = "select count(*) from employe";

		int i = getJdbcTemplate().queryForInt(EMPLOYE_COUNT);
		return i;
	}*/
}
