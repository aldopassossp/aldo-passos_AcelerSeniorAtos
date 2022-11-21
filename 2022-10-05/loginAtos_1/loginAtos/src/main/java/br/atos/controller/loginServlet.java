package br.atos.controller;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.atos.database.UserDao;
import br.atos.model.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		UserDao userDao = new UserDao();
		User user = new User();
		
		user.setNome(request.getParameter("nome"));
		user.setSenha(request.getParameter("senha"));
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		
		if(userDao.validaLogin(user)) {
			session.setAttribute("nome", user.getNome());
			dispatcher = request.getRequestDispatcher("index.jsp");
		}else {
			request.setAttribute("status", "falhou");
			dispatcher = request.getRequestDispatcher("login.jsp");
		}
		
		dispatcher.forward(request, response);
	}

}
