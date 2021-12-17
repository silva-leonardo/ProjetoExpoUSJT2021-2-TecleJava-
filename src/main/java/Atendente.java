
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

class Atendente {

    private String nome;
    private String cpf;
    private String telefone;
    private int idade;
    private String login;
    private String senha;
    private String cargahoraria;
    private String psd;
    private String funcao;
    private String sexo;
    private String horario;

    public Atendente(String cpf) {
        this.cpf = cpf;
    }

    Atendente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    Atendente(String nome, String cpf, String telefone, int idade, String senha, String horario, String psd, String funcao, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.senha = senha;
        this.horario = horario;
        this.psd = psd;
        this.funcao = funcao;
        this.sexo = sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(String cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Atendente(String nome, String cpf, String telefone, int idade, String senha, String cargahoraria, String psd, String funcao) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.senha = senha;
        this.cargahoraria = cargahoraria;
        this.psd = psd;
        this.funcao = funcao;
    }

    public Atendente(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void inserirecluirAtendente() {
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
            JOptionPane.showMessageDialog(null, "Falha ao remover o administrador secundário. Tente novamente mais tarde.");
        }
    }
}
