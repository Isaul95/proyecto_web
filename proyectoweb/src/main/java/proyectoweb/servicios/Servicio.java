package proyectoweb.servicios;

import java.util.List;

import proyectoweb.modelo.Alumnos;

public interface Servicio {//otro comentario
	
		public void eliminaralumnos();//jsjsjjsjsdha

		public List<Alumnos> obteneralumnos();

		int agregaralumno(Alumnos nuevo);
		int eliminaralumno(Alumnos nuevo);
		int modificaralumno(Alumnos nuevo);
		Alumnos Actualizaralumno(Alumnos nuevo);
		int Actualizaralumnofinal(Alumnos nuevo);
	}
