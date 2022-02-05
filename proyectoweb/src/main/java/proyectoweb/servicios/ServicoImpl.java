package proyectoweb.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectoweb.modelo.Alumnos;
import proyectoweb.repositorios.RepositorioDao;


@Service
public class ServicoImpl implements Servicio{
	
	@Autowired
	private RepositorioDao dao;

	public List<Alumnos> obteneralumnos() {
		// TODO Auto-generated method stub
		return dao.obteneralumnos();
	}

	public void eliminaralumnos() {
		// TODO Auto-generated method stub
		
	}

	public int agregaralumno(Alumnos nuevo) {
		// TODO Auto-generated method stub
		return dao.agregaralumno(nuevo);
	}

	public int eliminaralumno(Alumnos nuevo) {
		// TODO Auto-generated method stub
		return dao.eliminaralumno(nuevo);
	}

	public int modificaralumno(Alumnos nuevo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Alumnos Actualizaralumno(Alumnos nuevo) {
		// TODO Auto-generated method stub
		return dao.Actualizaralumno(nuevo);
	}

	public int Actualizaralumnofinal(Alumnos nuevo) {
		// TODO Auto-generated method stub
		return dao.Actualizaralumnofinal(nuevo);
	}
}
