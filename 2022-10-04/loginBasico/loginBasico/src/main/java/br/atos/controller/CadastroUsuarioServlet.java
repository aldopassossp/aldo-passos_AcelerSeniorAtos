package br.atos.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.atos.dataAccess.CadastroUsuarioDao;
import br.atos.model.UsuarioEntidade;

/**
 * Servlet implementation class CadastroUsuarioServlet
 */
@WebServlet("/cadastroUsuario")
public class CadastroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroUsuarioServlet() {
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
		CadastroUsuarioDao cadastroUsuarioDao = new CadastroUsuarioDao();
		
		String usuario = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmacao = request.getParameter("confirmacao");
		
		if(password.equals(confirmacao)) {
			
			UsuarioEntidade usuarioEntidade = new UsuarioEntidade();
			
			usuarioEntidade.setUsuario(usuario);
			usuarioEntidade.setPassword(password);
			
			if(cadastroUsuarioDao.validaCadastroUsuario(usuarioEntidade)) {
				response.sendRedirect("cadastroUsuarioSucesso.jsp");
			}else {
				response.sendRedirect("cadastroUsuarioErro.jsp");
			}
		}else {
		
			response.sendRedirect("cadastroUsuarioErro.jsp");
			
		}
	}

}
