package proyectoweb.mapeos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import proyectoweb.modelo.Alumnos;

public class MapeoAlumnos<T> implements RowMapper<Alumnos> {
	
	public Alumnos mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Alumnos asigna=new Alumnos ();
		asigna.setId_alumno(rs.getLong("ID_ALUMNO"));
		asigna.setApellido(rs.getString("APELLIDO"));
		asigna.setNombre(rs.getString("NOMBRE"));
		asigna.setSexo(rs.getString("SEXO"));
		asigna.setEdad(rs.getInt("EDAD"));
		asigna.setTelefono(rs.getLong("TELEFONO"));
		return asigna;
	}

}
