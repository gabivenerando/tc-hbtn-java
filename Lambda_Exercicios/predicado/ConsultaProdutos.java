import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicate){

        List < Produto > filteredProducts = produtos.stream().filter((produto) -> predicate.test(produto)).collect(Collectors.toList());

        return filteredProducts;
    }


}
