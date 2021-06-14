package pe.edu.upeu.webapp.dao;

import java.util.List;

import pe.edu.upeu.webapp.entity.Alumno;

public interface AlumnoDao {
	public int create(Alumno a);
	public Alumno read(int id);
	public List<Alumno> readAll();
}
