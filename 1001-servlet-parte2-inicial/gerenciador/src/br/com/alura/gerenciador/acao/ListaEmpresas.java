package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("listando empresas");

		Banco banco = new Banco();
		java.util.List<Empresa> lista = banco.getEmpresas();
			
		request.setAttribute("empresas", lista);
			
			RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
			rd.forward(request, response);

		
	}
	
}
