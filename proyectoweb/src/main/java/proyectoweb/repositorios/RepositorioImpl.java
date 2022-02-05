package proyectoweb.repositorios;


import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import proyectoweb.mapeos.MapeoAlumnos;
import proyectoweb.modelo.Alumnos;

public class RepositorioImpl implements RepositorioDao{
	

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate=new JdbcTemplate();
	

	public List<Alumnos> obteneralumnos() {
		// TODO Auto-generated method stub
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query("SELECT * FROM ALUMNO", new MapeoAlumnos<Alumnos>());
		
	}

	
	public void eliminaralumnos() {
		// TODO Auto-generated method stub
		
	
	}


	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public int agregaralumno(Alumnos nuevo) {
		// TODO Auto-generated method stub
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("INSERT INTO ALUMNO(APELLIDO,NOMBRE,SEXO,EDAD,TELEFONO)VALUES(?,?,?,?,?)",
				nuevo.getApellido(),nuevo.getNombre(),nuevo.getSexo(),nuevo.getEdad(),nuevo.getTelefono());
		
	}


	public int eliminaralumno(Alumnos nuevo) {
		// TODO Auto-generated method stub
		jdbcTemplate.setDataSource(getDataSource());
		Object []idalumno = {nuevo.getId_alumno()};
		int[] types = {Types.INTEGER};
		return jdbcTemplate.update("DELETE FROM ALUMNO WHERE ID_ALUMNO=?", idalumno,types);
	
	
	}


	public Alumnos Actualizaralumno(Alumnos nuevo) {
		// TODO Auto-generated method stub
		jdbcTemplate.setDataSource(getDataSource());
		Object []idalumno = {nuevo.getId_alumno()};
		return jdbcTemplate.queryForObject("SELECT * FROM ALUMNO WHERE ID_ALUMNO=?", idalumno,new MapeoAlumnos<Alumnos>());
	}


	public int Actualizaralumnofinal(Alumnos nuevo) {
		// TODO Auto-generated method stub
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("UPDATE ALUMNO SET APELLIDO=?, NOMBRE=?, SEXO=?, EDAD=?, TELEFONO=? WHERE ID_ALUMNO=?",
				nuevo.getApellido(),nuevo.getNombre(),nuevo.getSexo(),nuevo.getEdad(),nuevo.getTelefono(),nuevo.getId_alumno());
	}




}

