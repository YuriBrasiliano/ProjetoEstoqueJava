package br.edu.unicid.view;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import br.edu.unicid.dao.ProdutoDAO;
import br.edu.unicid.bean.Produto;


@WebServlet("/ServletProduto")
public class ServletProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {
    	        response.setContentType("text/html;charset=UTF-8");
    	        String cmd = request.getParameter("cmd");
    	        ProdutoDAO dao;
    	        Produto produto = new Produto();
    	        if (cmd != null) {
    	            try {
    	            	produto.setCodigo(Integer.parseInt(request.getParameter("txtCod")));  
    	            	produto.setNome(request.getParameter("txtNome"));
    	            	produto.setDescricao(request.getParameter("txtDesc"));
    	            	produto.setQuantidade(Integer.parseInt(request.getParameter("txtQuant")));
    	             
    	            } catch (Exception ex) {
    	                ex.printStackTrace();
    	            }
    	        }
    	        try {
    	            dao = new ProdutoDAO();
    	            RequestDispatcher rd = null;
    	            if (cmd.equalsIgnoreCase("listar")) {
    	                List produtosList = dao.consultartodos();
    	                request.setAttribute("produtosList", produtosList);
    	                //rd = request.getRequestDispatcher("/listProdutos.jsp");
    	            }
    	            else if (cmd.equalsIgnoreCase("incluir")) {
    	                dao.salvar(produto);
    	                rd = request.getRequestDispatcher("ServletProduto?cmd=listar");
    	                
    	            } else if (cmd.equalsIgnoreCase("exc")) {
    	            	produto = dao.consultar(produto.getCodigo());
    	                HttpSession session = request.getSession(true);
    	                session.setAttribute("produto", produto);
    	                rd = request.getRequestDispatcher("/excluir.jsp");
    	                
    	            } else if (cmd.equalsIgnoreCase("excluir")) {
    	                dao.excluir(1);
    	                rd = request.getRequestDispatcher("ServletAlunos?cmd=listar");
    	            
    	            // consulta aluno para alteração
    	            }  else if (cmd.equalsIgnoreCase("atu")) {
    	            	produto = dao.consultar(produto.getCodigo());
    	                HttpSession session = request.getSession(true);
    	                session.setAttribute("aluno", produto);
    	                rd = request.getRequestDispatcher("/atualizar.jsp");
    	             
    	            // consulta aluno
    	            } else if (cmd.equalsIgnoreCase("con")) {
    	            	produto = dao.consultar(produto.getCodigo());
    	                HttpSession session = request.getSession(true);
    	                session.setAttribute("aluno", produto);
    	                rd = request.getRequestDispatcher("/consultar.jsp");
    	            
    	             // altera aluno    
    	            } else if (cmd.equalsIgnoreCase("atualizar")) {
    	                dao.atualizar(produto);
    	                rd = request.getRequestDispatcher("ServletAlunos?cmd=listar");
    	            
    	            // direciona para a página principal
    	            } else if (cmd.equalsIgnoreCase("principal")) {
    	                rd = request.getRequestDispatcher("/index.jsp");
    	            }            
    	            // executa a ação de direcionar para a página JSP
    	            rd.forward(request, response);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	            throw new ServletException(e);
    	            }
    	        }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

}
