
import java.util.ArrayList;
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

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo){
        List<Produto> produtosPrecoMinimo = produtos.stream().filter( produto -> produto.getPreco() >= precoMinimo).collect(Collectors.toList());
        return produtosPrecoMinimo;
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos){

        List<Pedido> listPedido = pedidos.stream().filter(item -> item.getProdutos().stream().map(Produto::getCategoriaProduto).anyMatch(categoriaProduto -> categoriaProduto.equals(CategoriaProduto.ELETRONICO)))
                .collect(Collectors.toList());
        return listPedido;
    }

    public static List <Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos){
        List<Produto> listPedido =  produtos.stream().map(produto -> {
                    if (produto.getCategoriaProduto().equals(CategoriaProduto.ELETRONICO))
                        produto.setPreco(produto.getPreco() - produto.getPreco() * 0.15);
                    return produto;
                }).collect(Collectors.toList());
        return listPedido;
    }

}
