package pe.edu.upeu.webapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.edu.upeu.webapp.dao.AlumnoDao;
import pe.edu.upeu.webapp.daoImpl.AlumnoDaoImpl;
import pe.edu.upeu.webapp.entity.Alumno;



/**
 * Servlet implementation class UsuarioController
 */
public class AlumnoController extends HttpServlet {
	private Gson gson = new Gson();
	private AlumnoDao udao = new AlumnoDaoImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlumnoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		String user = request.getParameter("user");
		String telf = request.getParameter("telf");
		String corr = request.getParameter("corr");
		switch (op) {
		case 1:
			out.println(udao.create(new Alumno(user,telf,corr,1)));
			break;
		case 2:
			out.println(gson.toJson(udao.readAll()));
			break;
		default:
			break;
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
