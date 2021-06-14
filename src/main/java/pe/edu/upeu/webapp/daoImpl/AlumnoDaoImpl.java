package pe.edu.upeu.webapp.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upeu.webapp.config.Conexion;
import pe.edu.upeu.webapp.dao.AlumnoDao;
import pe.edu.upeu.webapp.entity.Alumno;

public class AlumnoDaoImpl implements AlumnoDao{
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private Connection cx = null;

	
	@Override
	public int create(Alumno a) {
		int x = 0;
		String SQL = "insert into alumno (idalumno, nombre, telefono, correo, estado) value(null, ?,?,?,1)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, a.getNombre());
			ps.setString(2, a.getTelefono());
			ps.setString(3, a.getCorreo());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	
	@Override
	public Alumno read(int id) {
		Alumno a = new Alumno();
		String SQL = "select *from usuario where idusuario=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {				
				a.setIdalumno(rs.getInt("idalumno"));
				a.setNombre(rs.getString("nombre"));
				a.setTelefono(rs.getString("telefono"));
				a.setCorreo(rs.getString("correo"));
				a.setEstado(rs.getInt("estado"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return a;
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		List<Alumno> lista = new ArrayList<>();
		String SQL = "select *from alumno";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery();
			while (rs.next()) {
				Alumno a = new Alumno();
				a.setIdalumno(rs.getInt("idalumno"));
				a.setNombre(rs.getString("nombre"));
				a.setTelefono(rs.getString("telefono"));
				a.setCorreo(rs.getString("correo"));
				lista.add(a);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return lista;
	}

	

}

