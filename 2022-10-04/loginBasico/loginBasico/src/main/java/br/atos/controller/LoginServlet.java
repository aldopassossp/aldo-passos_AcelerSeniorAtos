package br.atos.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.atos.dataAccess.LoginDao;
import br.atos.model.UsuarioEntidade;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginDao loginDao = new LoginDao();
		
		String usuario = request.getParameter("username");
		String password = request.getParameter("password");
		
		UsuarioEntidade usuarioEntidade = new UsuarioEntidade();
		
		usuarioEntidade.setUsuario(usuario);
		usuarioEntidade.setPassword(password);
		
		if(loginDao.validaLogin(usuarioEntidade)) {
			response.sendRedirect("loginSucesso.jsp");
		}else {
			response.sendRedirect("loginErro.jsp");
		}
	}

}
