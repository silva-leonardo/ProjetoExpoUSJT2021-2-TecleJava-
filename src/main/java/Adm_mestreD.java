public class Adm_mestreD {

    private String login;
    private String senha;
    public String nome;

    public Adm_mestreD(String login, String senha) {
        this.login = login;
        this.senha = senha;

    }

    Adm_mestreD(String nome) {
        this.nome = nome;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
