public class Produto {
    private int codigo;
    private String nome;
    private CategoriaProduto categoriaProduto;
    private double preco;

    public Produto(int codigo, String nome, CategoriaProduto categoriaProduto, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoriaProduto = categoriaProduto;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s %.2f ", this.getCodigo(), this.getNome(), this.getCategoriaProduto(), this.getPreco());
    }
}
