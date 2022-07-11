import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro){

        List < Produto > filteredProducts = produtos.stream().filter((product) -> criterioFiltro.testar(product)).collect(Collectors.toList());

        return filteredProducts;
    }


}
