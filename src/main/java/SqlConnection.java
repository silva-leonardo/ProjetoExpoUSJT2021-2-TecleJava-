
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SqlConnection {

    private static String host = "localhost";
    private static String porta = "3306";
    private static String bd = "teclejava";
    private static String usuario = "root";
    private static String senha = "ProjetoFilaDeVacinação-USJT2021/1";

    public static Connection obterConexao() throws Exception {

        Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd + "?userTimezone=true&serverTimezone=America/Sao_Paulo", usuario, senha);

        return c;
    }

}
