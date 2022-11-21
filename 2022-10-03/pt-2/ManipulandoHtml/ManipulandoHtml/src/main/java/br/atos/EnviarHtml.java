package br.atos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnviarHtml
 */
@WebServlet("/EnviarHtml")
public class EnviarHtml extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnviarHtml() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter saida = response.getWriter();
		saida.println("<!DOCTYPE html");
		saida.println("<html>");
		saida.println("<head>");
		saida.println("<meta charset=\"ISO-8859-1\">");
		saida.println("<title>Dados do Aluno</title>");		
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<h2>Dados do Aluno</h2>");
		saida.println("<h1>Nome: </h1>");
		saida.println("<p>Aldo Passos </p>");
		saida.println("<h1>E-mail: </h1>");
		saida.println("<p>aldopassos@gmail.com </p>");
		saida.println("<h1>Idade: </h1>");
		saida.println("<p>41 anos </p>");
		saida.println("<h1>Como se enxerga daqui 5 anos dentro do universo java: </h1>");
		saida.println("<p>Um programador com bons conhecimentos em java, sênior na Atos trabalhando em bons projetos nesta tecnologia.</p>");
		saida.println("<h1>Esporte favorito: </h1>");
		saida.println("<p>Futebol </p>");
		
		saida.println("</body>");		
		saida.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
