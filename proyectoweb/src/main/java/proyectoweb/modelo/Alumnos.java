package proyectoweb.modelo;

public class Alumnos {
	private Long id_alumno;// se movio
	private String nombre;
	private String apellido;
	private String sexo;
	private int edad;
	private Long telefono;

	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Long getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(Long id_alumno) {
		this.id_alumno = id_alumno;
	}
	
	

}
