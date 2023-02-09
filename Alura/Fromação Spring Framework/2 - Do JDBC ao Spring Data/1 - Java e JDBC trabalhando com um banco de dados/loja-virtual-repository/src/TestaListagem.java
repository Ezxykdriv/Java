import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		Statement stm = connection.createStatement();
		boolean resultados = stm.execute("SELECT id, nome, descricao from produto");

		System.out.println(resultados);

		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getNString("NOME");
			System.out.println(nome);
			String descricao = rst.getNString("DESCRICAO");
			System.out.println(descricao);
		}

		connection.close();
	}
}