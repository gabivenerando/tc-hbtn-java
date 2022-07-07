import java.util.HashMap;
import java.util.Map;

public abstract class Armazem <T> implements Armazenavel <T>{
    private Map<String, T> mapList = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
       this.mapList.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {

        T result = null;

            if(mapList.containsKey(nome)){
               result = mapList.get(nome);
            }

        return result;
    }
}
