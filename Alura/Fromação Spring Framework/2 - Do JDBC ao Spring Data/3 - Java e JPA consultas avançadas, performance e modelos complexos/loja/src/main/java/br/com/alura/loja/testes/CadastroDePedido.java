package br.com.alura.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDAO;
import br.com.alura.loja.dao.ClienteDAO;
import br.com.alura.loja.dao.PedidoDAO;
import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Cliente;
import br.com.alura.loja.modelo.ItemPedido;
import br.com.alura.loja.modelo.Pedido;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;
import br.com.alura.loja.vo.RelatorioDeVendasVO;

public class CadastroDePedido {
	
	public static void main(String[] args) {
		popularBancoDeDados();
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDAO = new ProdutoDAO(em);
		ClienteDAO clienteDAO = new ClienteDAO(em);
		Produto produto = produtoDAO.buscarPorId(1l);
		Cliente cliente = clienteDAO.buscarPorId(1l);
		
		em.getTransaction().begin();
		
		Pedido pedido = new Pedido(cliente);
		pedido.adicionarItem(new ItemPedido(10, pedido, produto));
		
		PedidoDAO pedidoDAO = new PedidoDAO(em);
		pedidoDAO.cadastrar(pedido);
		
		em.getTransaction().commit();
		
		BigDecimal totalVendido = pedidoDAO.valorTotalVendido();
		System.out.println("Total vendido: " + totalVendido);
		
		List<RelatorioDeVendasVO> relatorio = pedidoDAO.relatorioDeVendas();
		relatorio.forEach(System.out::println);
	}
	
	private static void popularBancoDeDados() {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares);
		Cliente cliente = new Cliente("Matheus Fac�o", "046.898.501-86");
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDAO = new ProdutoDAO(em);
		CategoriaDAO categoriaDAO = new CategoriaDAO(em);
		ClienteDAO clienteDAO = new ClienteDAO(em);

		em.getTransaction().begin();
		
		categoriaDAO.cadastrar(celulares);
		produtoDAO.cadastrar(celular);
		clienteDAO.cadastrar(cliente);
		em.getTransaction().commit();
		em.close();
	}
}