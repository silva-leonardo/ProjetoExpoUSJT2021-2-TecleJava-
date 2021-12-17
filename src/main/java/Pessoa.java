
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pessoa {

    private int codigo;
    private String nome;
    private int idade;
    private int saude;
    private String endereco;
    private String data;
    private int prioridade;
    private String sexo;
    private String cep;
    private String numero;
    private String bairro;
    private String complemento;
    private String telefone;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf, String endereco,
            String cep, String numero, String bairro, String complemento, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.telefone = telefone;

    }

    public Pessoa(String nome, String cpf, String telefone, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
    }

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    Pessoa(String nome, int idade, String endereco, String data, int prioridade, String sexo, String cep, String numero, String bairro, String complemento, String telefone, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.prioridade = prioridade;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data = data;
        this.sexo = sexo;

    }

    public Pessoa(String nome, int idade, String cpf, int prioridade, String endereco, String cep, String numero, String bairro, String complemento, String telefone) {

        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.prioridade = prioridade;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public Pessoa(String nome, int idade, String cpf, int prioridade, String endereco, String cep, String numero, String bairro, String complemento, String telefone, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.prioridade = prioridade;
        this.sexo = sexo;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    Pessoa(String nome, int idade, String cpf, int prioridade, int saude, String endereco, String cep, String numero, String bairro, String complemento, String telefone, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.prioridade = prioridade;
        this.saude = saude;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.telefone = telefone;

    }

    Pessoa(String nome, int idade, String cpf, String endereco, int prioridade, int saude, String cep, String numero, String bairro, String complemento, String telefone, String sexo, String data) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.prioridade = prioridade;
        this.saude = saude;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.telefone = telefone;
        this.data = data;
    }

    Pessoa(String cpf) {
        this.cpf = cpf;
    }

    Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    Pessoa(String nome, String cpf, int idade, String telefone, String endereco, String cep, String numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;

    }

    Pessoa(String nome, int idade, String cpf, int prioridade, String endereco, String cep, String numero, String bairro, String complemento, String telefone, String sexo, String data) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.prioridade = prioridade;
        this.bairro = bairro;
        this.complemento = complemento;
        this.sexo = sexo;
        this.data = data;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(String cpf, int idade, int prioridade, String nome, String endereco, int saude) {
        this.nome = nome;
        this.idade = idade;
        this.saude = saude;
        this.endereco = endereco;
        this.prioridade = prioridade;
        this.cpf = cpf;
    }

    public Pessoa(String nome, int idade, int saude, String cpf, int prioridade) {
        this.nome = nome;
        this.idade = idade;
        this.saude = saude;
        this.prioridade = prioridade;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return cpf + "                                                        -                " + nome + "        -        "
                + idade;
    }

    public String getNome2() {
        return nome;
    }

    public String getCpf2() {
        return cpf;
    }

    public String getCep2() {
        return cep;
    }

    public void setNome2(String nome) {
        this.nome = nome;
    }

    public void setAplicacao(String Cpf) {
        this.cpf = cpf;
    }

    public void setDescricao(String Cep) {
        this.cep = cep;
    }

    public void inserirPaciente1Dose() {
        String sql = "INSERT INTO p_pendente1dose"
                + "(nome, idade, Profissional_Saude, cpf, Endereço, cep, numero, bairro, complemento, telefone, prioridade, sexo)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //2. abrir a conexão com o banco 
        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {
            //3. pré-compilar o comando sql
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

    public void inserirPacienteVacinado() {
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
            JOptionPane.showMessageDialog(null, "Vacinação registrada.");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao confirmar vacinação");
        }
    }

    public Pessoa obterPessoa() {

        SqlConnection Connection = new SqlConnection();

        try {
            Connection cn = SqlConnection.obterConexao();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM  p_pendente1dose WHERE cpf = ?");
            ps.setString(1, cpf);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            String nome = rs.getString("nome");
            int idade = rs.getInt("idade");
            String cpf = rs.getString("cpf");
            int prioridade = rs.getInt("prio");
            String endereco = rs.getString("Endereco");
            String cep = rs.getString("cep");
            String numero = rs.getString("numero");
            String bairro = rs.getString("bairro");
            String complemento = rs.getString("complemento");
            String telefone = rs.getString("complemento");
            Pessoa p = new Pessoa(nome, idade, cpf, prioridade, endereco, cep, numero, bairro, complemento, telefone);
            return p;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public void inserirecluir() {
        String sql = "INSERT INTO historico_pessoas(nome, cpf, telefone, Endereço, cep, numero, idade) VALUES (?, ?, ?, ?, ?, ?, ?)";
        SqlConnection Connection = new SqlConnection();
        try (Connection c = Connection.obterConexao()) {
            //3. pré-compilar o comando sql
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

}
