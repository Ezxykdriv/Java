package br.com.alura.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDAO;
import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.CategoriaId;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {
		cadastrarProduto();
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDAO = new ProdutoDAO(em);
		
		Produto produto = produtoDAO.buscarPorId(1l);
		System.out.println(produto.getPreco());
		
		List<Produto> produtos = produtoDAO.buscarTodos();
		produtos.forEach(p -> System.out.println(p.getNome()));
		
		produtos = produtoDAO.buscarPorNome("Xiaomi Redmi");
		produtos.forEach(p -> System.out.println(p.getNome()));
		
		produtos = produtoDAO.buscarPorNomeDaCategoria("CELULARES");
		produtos.forEach(p -> System.out.println(p.getNome()));
		
		BigDecimal precoDoProduto = produtoDAO.buscarPrecoDoProdutoComNome("Xiaomi Redmi");
		System.out.println("Pre�o do Produto: " + precoDoProduto);
	}

	private static void cadastrarProduto() {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares);

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDAO = new ProdutoDAO(em);
		CategoriaDAO categoriaDAO = new CategoriaDAO(em);

		em.getTransaction().begin();
		categoriaDAO.cadastrar(celulares);
		produtoDAO.cadastrar(celular);
		em.getTransaction().commit();
		
		em.find(Categoria.class, new CategoriaId("CELULARES", "xpto"));
		em.close();
	}
}