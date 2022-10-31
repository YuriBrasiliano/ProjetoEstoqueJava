package br.edu.unicid.view;

import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.unicid.bean.Produto;
import br.edu.unicid.dao.ProdutoDAO;

public class index {

	public static void main(String[] args) throws Exception {
		
// Selecionar e pressionar CRTL + SHIFT + C para comentar e descomentar

//Salvar
		try {
			ProdutoDAO dao = new ProdutoDAO();
			Produto produto = new Produto(111,"Teste111", "Teste111", 111);
			dao.salvar(produto);
			JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Houve um erro, por favor verifique se todos os campos foram preenchidos!");
		}
		try {
			ProdutoDAO dao = new ProdutoDAO();
			Produto produto = new Produto(222,"Teste222", "Teste222", 222);
			dao.salvar(produto);
			JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Houve um erro, por favor verifique se todos os campos foram preenchidos!");
		}
	
//Atualizar
//		try {
//			ProdutoDAO dao = new ProdutoDAO();
//			Produto produto = new Produto(111, "Testenovo111", "Testenovo111" , 1111);
//			dao.atualizar(produto);
//			JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
//		}catch(Exception e) {
//			JOptionPane.showMessageDialog(null, "Houve um erro, por favor verifique se todos os campos foram preenchidos!");
//			System.out.println(e.getMessage());
//		}

//Procurar 

//		try {
//			ProdutoDAO dao = new ProdutoDAO();
//			Produto produto = new Produto();
//			int codigo = 111;
//			produto = dao.consultar(codigo);
//			String nome = produto.getNome();
//			String descricao = produto.getDescricao();
//			int quantidade = produto.getQuantidade();
//			JOptionPane.showMessageDialog(null, codigo +"\n"+ nome + "\n"+descricao + "\n"+quantidade);
//		}catch(Exception e) {
//			JOptionPane.showMessageDialog(null, "Houve um erro, por favor verifique se o código esta correto!");
//			System.out.println(e.getMessage());
//		}
	

//Listar

		
//		try {
//			ProdutoDAO dao = new ProdutoDAO();
//			for (Produto model : dao.consultartodos()) {
//	            System.out.println(model.getCodigo()+"\n"+ model.getNome() +"\n"+ model.getQuantidade() +"\n"+ model.getDescricao()+"\n"+"\n");
//	        }
//		}catch(Exception e) {
//			JOptionPane.showMessageDialog(null, "Houve um erro, por favor verifique se há registros no banco!");
//			System.out.println(e.getMessage());
//		}
//		
		
//Excluir
//		
//		try {
//			ProdutoDAO dao = new ProdutoDAO();
//			int codigoProduto = 111;
//			dao.excluir(codigoProduto);
//			JOptionPane.showMessageDialog(null, "Dado excluido com sucesso!!");
//		}catch(Exception e) {
//			JOptionPane.showMessageDialog(null, "Houve um erro, por favor verifique se todos os campos foram preenchidos!");
//			System.out.println(e.getMessage());
//		}
		
	
		
		

}
	}
