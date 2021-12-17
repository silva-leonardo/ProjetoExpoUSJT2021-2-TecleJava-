
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DAO {

    public boolean AdmMestreExiste(Adm_mestreD u) throws Exception {

        String sql = "SELECT * FROM admin_mestre where login = ? AND senha = ?";

        SqlConnection factory = new SqlConnection();
        try (Connection c = SqlConnection.obterConexao();
                PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setString(1, u.getLogin());
            ps.setString(2, u.getSenha());

            try (ResultSet rs = ps.executeQuery()) {

                return rs.next();

            }
        }
    }

    public boolean admexiste(Admin_secundario v) throws Exception {

        String sql = "SELECT * FROM admin_secundario where cpf = ? AND senha = ?";

        SqlConnection factory = new SqlConnection();
        try (Connection c = SqlConnection.obterConexao();
                PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setString(1, v.getLogin());
            ps.setString(2, v.getSenha());

            try (ResultSet rs = ps.executeQuery()) {

                return rs.next();

            }
        }
    }

    public boolean atendenteExiste(Atendente a) throws Exception {

        String sql = "SELECT * FROM atendente where cpf = ? AND senha = ?";

        SqlConnection factory = new SqlConnection();
        try (Connection c = SqlConnection.obterConexao();
                PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setString(1, a.getLogin());
            ps.setString(2, a.getSenha());

            try (ResultSet rs = ps.executeQuery()) {

                return rs.next();
            }
        }
    }

    public void apagarAtendente1(String cpf) throws Exception {

        String nome = null, telefone = null;
        try {
            Connection cn = SqlConnection.obterConexao();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM  atendente where cpf= ?");

            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                nome = rs.getString("Nome");

                String cpf2 = rs.getString("cpf");

                telefone = rs.getString("telefone");
                Atendente a = new Atendente(nome, cpf, telefone);
                try {
                    cn = SqlConnection.obterConexao();
                    ps = cn.prepareStatement("insert into historico_atendente values (?,?,?");

                    ps.setString(1, nome);
                    ps.setString(2, cpf);
                    ps.setString(3, telefone);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void apagarAtendente(String cpf) throws Exception {

        String sql = "DELETE FROM atendente where cpf = ?";

        try (Connection conexao = SqlConnection.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, cpf);

            ps.execute();
            JOptionPane.showMessageDialog(null, "Removido com sucesso.");
        }
    }

    public void apagarPessoa(String cpf) throws Exception {

        String sql = "DELETE FROM p_pendente1dose where cpf = ?";

        try (Connection conexao = SqlConnection.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, cpf);

            ps.execute();
            JOptionPane.showMessageDialog(null, "Removido com sucesso.");
        }
    }

    public void apagarPessoaVacinada(String cpf) throws Exception {

        String sql = "DELETE FROM p_pendente1dose where cpf = ?";

        try (Connection conexao = SqlConnection.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, cpf);

            ps.execute();

        }
    }

    public void removerAdmSec1(String cpf) throws Exception {

        String nome = null, telefone = null;
        try {
            Connection cn = SqlConnection.obterConexao();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM  admin_secundario where cpf= ?");

            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                nome = rs.getString("Nome");

                String cpf2 = rs.getString("cpf");

                telefone = rs.getString("telefone");
                Admin_secundario admSec2 = new Admin_secundario(nome, cpf, telefone);
                admSec2.inserirecluir();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removerAdmSec2(String cpf) throws Exception {
        try {

            Admin_secundario admsSc = new Admin_secundario(cpf);

            String sql = "DELETE FROM admin_secundario WHERE cpf=?";

            SqlConnection Connection = new SqlConnection();
            try (Connection c = Connection.obterConexao()) {

                PreparedStatement ps = c.prepareStatement(sql);

                ps.setString(1, cpf);

                ps.execute();
                JOptionPane.showMessageDialog(null, "Removido com sucesso.");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Falha ao exluir o administrador. Tente novamente mais tarde.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados");
        }
    }

    public void inserirAdmSec(String nome, String cpf, String senha, String telefone, int idade) {
        String sql = "INSERT INTO admin_secundario(nome, cpf, senha, telefone, idade) VALUES (?, ?, ?, ?, ?)";
        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, senha);
            ps.setString(5, telefone);
            ps.setInt(4, idade);

            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar o administrador secundário. Tente novamente mais tarde");
        }
    }

    public void inserirAtendente(String nome, String cpf, String telefone, int idade, String senha, String cargaHoraria, String psd, String funcao) {
        String sql = "INSERT INTO atendente(nome, cpf, telefone, idade, senha, cargahoraria, psd, funcao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, telefone);
            ps.setInt(4, idade);
            ps.setString(5, senha);
            ps.setString(6, cargaHoraria);
            ps.setString(7, psd);
            ps.setString(8, funcao);

            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar atendente. Tente novamente mais tarde");
        }
    }

    public void inserirecluirAtendente(String nome, String cpf, String telefone) {
        String sql = "INSERT INTO historico_atendentes(nome, cpf, telefone) VALUES (?, ?, ?)";
        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, telefone);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao remover o administrador secundário. Tente novamente mais tarde");
        }
    }

    public void apagarAtendente2(String cpf) {
        String sql = "DELETE FROM atendente WHERE cpf=?";

        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, cpf);

            ps.execute();
            JOptionPane.showMessageDialog(null, "Removido com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao excluir atendente. Tente novamente mais tarde");
        }

    }

    public void inserirPaciente1Dose(String nome, int idade, int saude, String cpf, String endereco, String cep, String numero, String bairro,
            String complemento, String telefone, int prioridade, String sexo) {
        String sql = "INSERT INTO p_pendente1dose"
                + "(nome, idade, Profissional_Saude, cpf, Endereço, cep, numero, bairro, complemento, telefone, prioridade, sexo)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setInt(2, idade);
            ps.setInt(3, saude);
            ps.setString(4, cpf);
            ps.setString(5, endereco);
            ps.setString(6, cep);
            ps.setString(7, numero);
            ps.setString(8, bairro);
            ps.setString(9, complemento);
            ps.setString(10, telefone);
            ps.setInt(11, prioridade);
            ps.setString(12, sexo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso.");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Dados incorretos ou faltantes.");
        }
    }

    public void inserirecluirPessoa(String nome, String cpf, String telefone, String endereco, String cep, String numero, int idade) {
        String sql = "INSERT INTO historico_pessoas(nome, cpf, telefone, Endereço, cep, numero, idade) VALUES (?, ?, ?, ?, ?, ?, ?)";
        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, telefone);
            ps.setString(4, endereco);
            ps.setString(5, cep);
            ps.setString(6, numero);
            ps.setInt(7, idade);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void inserirAtendente(String nome, String cpf, String telefone, int idade, String senha, String horario, String psd, String funcao, String sexo) {
        String sql = "INSERT INTO atendente(nome, cpf, telefone, idade, senha, cargahoraria, psd, funcao, sexo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        //2. abrir a conexão com o banco 
        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {
            //3. pré-compilar o comando sql
            PreparedStatement ps = c.prepareStatement(sql);
            //4. Preencher os dados faltantes, substituindo os ?    
            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, telefone);
            ps.setInt(4, idade);
            ps.setString(5, senha);
            ps.setString(6, horario);
            ps.setString(7, psd);
            ps.setString(8, funcao);
            ps.setString(9, sexo);

            //5. Executar o comando
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar atendente. Tente novamente mais tarde.");
        }
    }

    public void inserirPacienteVacinado(String nome, int idade, int saude, String endereco, String data, int prioridade, String sexo,
            String cep, String numero, String bairro, String complemento, String telefone, String cpf) {
        String sql = "INSERT INTO p_vacinadas"
                + "(Nome, idade, Profissional_Saude, Endereço, Data_da_Vacinação, prioridade, Sexo, Cep, Numero, bairro, complemento, telefone, CPF)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //2. abrir a conexão com o banco 
        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {
            //3. pré-compilar o comando sql
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setInt(2, idade);
            ps.setInt(3, saude);
            ps.setString(4, endereco);
            ps.setString(5, data);
            ps.setInt(6, prioridade);
            ps.setString(7, sexo);
            ps.setString(8, cep);
            ps.setString(9, numero);
            ps.setString(10, bairro);
            ps.setString(11, complemento);
            ps.setString(12, telefone);
            ps.setString(13, cpf);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Vacinação registrada");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao confirmar vacinação");
        }
    }

}
