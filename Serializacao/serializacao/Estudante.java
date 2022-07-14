import java.io.Serializable;

public class Estudante implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idade;
    private String nome;
    transient private String senha;

    public Estudante(int idade, String nome, String senha) {
        this.idade = idade;
        this.nome = nome;
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return String.format("Estudante { nome='%s', idade='%s', senha='%s' }", getNome(), getIdade(), getSenha());
    }
}
