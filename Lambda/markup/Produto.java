import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private double preco;
    private String nome;
    private double percentualMarkup = 10;


    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;

    }

    Supplier <Double> precoComMarkup = () -> { return this.preco + ((percentualMarkup / 100) * this.preco);};
    Consumer <Double> atualizarMarkup = (valor) -> { this.percentualMarkup = valor;};



    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


}
