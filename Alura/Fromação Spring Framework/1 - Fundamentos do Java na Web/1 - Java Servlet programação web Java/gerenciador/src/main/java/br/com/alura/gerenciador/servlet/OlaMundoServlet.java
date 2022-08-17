package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/olaMundo")
public class OlaMundoServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws IOException{
		
		PrintWriter saida = resposta.getWriter();
		saida.println("<html>");
		saida.println("<body>");
		saida.println("Ola Mundo, esse eh o meu primeiro Servlet");
		saida.println("</body>");
		saida.println("</html>");
		
		System.out.println("o servlet OlaMundo foi chamado");
	}
}