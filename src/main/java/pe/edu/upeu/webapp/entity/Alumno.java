package pe.edu.upeu.webapp.entity;

public class Alumno {
	private int idalumno;
	private String nombre;
	private String telefono;
	private String correo;
	private int estado;
	
	public Alumno() {

	}

	public Alumno(String nombre, String telefono, String correo, int estado) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.estado = estado;
	}

	public int getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
