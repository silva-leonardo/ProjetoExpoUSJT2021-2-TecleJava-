
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Admin_secundario {

    int codigo;
    private String nome;
    private String cpf;
    private String senha;

    private String telefone;
    private int idade;
    private String login;

    Admin_secundario(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    Admin_secundario(String nome, int idade, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Admin_secundario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Admin_secundario(String nome, int idade, String cpf, String telefone, String senha, String login) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;

        this.telefone = telefone;
        this.idade = idade;
        this.login = login;
    }

    public Admin_secundario(String cpf) {
        this.cpf = cpf;
    }

    //Cadastrar admin_sec
    public void inserir() {
        String sql = "INSERT INTO admin_secundario(nome, cpf, senha, telefone, idade, login) VALUES (?, ?, ?, ?, ?, ?)";
        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, cpf);
            ps.setString(3, senha);
            ps.setString(5, telefone);
            ps.setInt(4, idade);
            ps.setString(6, login);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar o administrador secundário. Tente novamente mais tarde");
        }
    }

    //Apagar admin_sec
    void apagar() {
        String sql = "DELETE FROM admin_secundario WHERE cpf=?";

        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, cpf);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao exluir o administrador. Tente novamente mais tarde");
        }
    }

    public void inserirecluir() {
        String sql = "INSERT INTO historico_admins(nome, cpf, telefone) VALUES (?, ?, ?)";
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
}
