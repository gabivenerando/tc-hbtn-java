import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){

        List<Produto> listProdutos = pedido.getProdutos();
        List<Produto> newList = listProdutos.stream().filter(produto -> produto.getCategoriaProduto().equals(CategoriaProduto.LIVRO)).collect(Collectors.toList());

        return newList;
    };

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        List<Produto> ordemReversa = produtos.stream().sorted(comparing(Produto::getPreco).reversed()).limit(1).collect(Collectors.toList());

        return ordemReversa.get(0);
    }
}
