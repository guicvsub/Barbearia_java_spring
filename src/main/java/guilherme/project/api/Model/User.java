package guilherme.project.api.Model;

public class User {
    private int id;
    private String nome;
    private String login;
    private String senha;

    public User(int id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

}
