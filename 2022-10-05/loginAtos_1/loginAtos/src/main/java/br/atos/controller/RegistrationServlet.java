package br.atos.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.atos.database.UserDao;
import br.atos.model.User;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PrintWriter saida = response.getWriter();
//		saida.print("Acessou o servlet");
		UserDao userDao = new UserDao();
		User user = new User();
		
		user.setNome(request.getParameter("nome"));
		user.setSenha(request.getParameter("senha"));
		user.setEmail(request.getParameter("email"));
		user.setTelefone(request.getParameter("telefone"));
		
		RequestDispatcher dispatcher = null;
		
		dispatcher = request.getRequestDispatcher("registration.jsp");
		
		if(userDao.salvarNoBanco(user)) {
			//saida.print("Registrado com sucesso");
			request.setAttribute("status", "sucesso");
		}else {
			//saida.print("Algo errado");
			request.setAttribute("status", "falhou");
		}
		
		dispatcher.forward(request, response);
	}

}
