package proyectoweb.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import proyectoweb.modelo.Alumnos;
import proyectoweb.servicios.Servicio;

@Controller
public class Controlador {
	
	@Autowired	
	Servicio service;
	

@RequestMapping("/login")
public String Login() {
	System.out.println("Intentando iniciar sesión");
	
	List<Alumnos>listadealumnos=service.obteneralumnos();
	//una lista es un conjunto de objetos
	for(Alumnos ver:listadealumnos) {
		System.out.println("id:"+ver.getTelefono());
			
		}//
	return "inicio";
}
@RequestMapping("/inicio")
public String inicio() {
	

	System.out.println("Entro al inicio");
	return "inicio";
}
@ResponseBody //
@RequestMapping(value = "/Obteneralumnos", method = RequestMethod.GET, produces="application/json")
public ResponseEntity <List<Alumnos>> obteneralumnos(){
	
	final HttpHeaders headers =new HttpHeaders();
	
	
List<Alumnos> listadealumnos=service.obteneralumnos();

headers.setContentType(MediaType.APPLICATION_JSON);
	//404 La URl no existe o no esta disponible
	//202 la peticion a la url que hiciste fue correcta y trae resultados
	//201 la peticion a la url que hiciste fue correcta
	//505 hubo alguna excepcion o error en la url que esta consultado
	return new ResponseEntity <List<Alumnos>> (listadealumnos, headers, HttpStatus.OK);
}
@ResponseBody //
@RequestMapping(value = "/Agregaralumnos", method = RequestMethod.POST, produces = "application/json")
public ResponseEntity <Integer> agregaralumnos(@ModelAttribute Alumnos nuevo){
	final HttpHeaders headers =new HttpHeaders();
	int respuesta=0;
	respuesta=service.agregaralumno(nuevo);
		
	headers.setContentType(MediaType.APPLICATION_JSON);
	
	return new ResponseEntity <Integer> (respuesta, headers, HttpStatus.OK);
}
@ResponseBody //
@RequestMapping(value = "/Eliminaralumno", method = RequestMethod.POST, produces = "application/json")
public ResponseEntity <Integer> eliminaralumno(@ModelAttribute Alumnos nuevo){
	final HttpHeaders headers =new HttpHeaders();
	int respuesta=0;
	respuesta=service.eliminaralumno(nuevo);
		
	headers.setContentType(MediaType.APPLICATION_JSON);
	
	return new ResponseEntity <Integer> (respuesta, headers, HttpStatus.OK);
}		
@ResponseBody //
@RequestMapping(value = "/ObtenerAlumno", method = RequestMethod.POST, produces = "application/json")
public ResponseEntity <Alumnos> onteneralumno(@ModelAttribute Alumnos nuevo){
	final HttpHeaders headers =new HttpHeaders();
	Alumnos alumno =new Alumnos();
	alumno = service.Actualizaralumno(nuevo);		
	headers.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <Alumnos> (alumno, headers, HttpStatus.OK);
}		
@ResponseBody //
@RequestMapping(value = "/ActualizarAlumno", method = RequestMethod.POST, produces = "application/json")
public ResponseEntity <Integer> actualizaralumno(@ModelAttribute Alumnos nuevo){
	final HttpHeaders headers =new HttpHeaders();
	System.out.println("UpdateAlumno ->" + nuevo.getApellido() + nuevo.getId_alumno()+ nuevo.getNombre()+ nuevo.getEdad());
	int respuesta=0;
	respuesta=service.Actualizaralumnofinal(nuevo);		
	headers.setContentType(MediaType.APPLICATION_JSON);
	return new ResponseEntity <Integer> (respuesta, headers, HttpStatus.OK);
}		

}
	
