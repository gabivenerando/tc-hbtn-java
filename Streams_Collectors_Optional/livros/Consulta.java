import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){

        List<Produto> listProdutos = pedido.getProdutos();
        List<Produto> newList = listProdutos.stream().filter(produto -> produto.getCategoriaProduto().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());

        return newList;
    };
}
