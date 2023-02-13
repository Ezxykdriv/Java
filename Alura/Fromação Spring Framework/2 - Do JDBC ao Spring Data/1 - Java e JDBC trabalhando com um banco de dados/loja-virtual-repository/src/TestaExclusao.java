import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaExclusao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		stm.setInt(1, 2);
		stm.execute();
		
		System.out.println("Quantidade de linhas que foram modificadas: " + stm.getUpdateCount());
	}
}
