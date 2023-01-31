import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "/7Falcao/");

		Statement stm = con.createStatement();
		boolean resultados = stm.execute("Select id, nome, descricao from produto");

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

		con.close();
	}
}