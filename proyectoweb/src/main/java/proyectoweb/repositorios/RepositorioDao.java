package proyectoweb.repositorios;

import java.util.List;

import proyectoweb.modelo.Alumnos;

public interface RepositorioDao {
	
	public void eliminaralumnos();
	public List<Alumnos> obteneralumnos();
    int agregaralumno(Alumnos nuevo);
    int eliminaralumno(Alumnos nuevo);
	Alumnos Actualizaralumno(Alumnos nuevo);
	int Actualizaralumnofinal(Alumnos nuevo);
}
