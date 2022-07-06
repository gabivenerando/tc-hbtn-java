import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T extends Midia>{
    private List<T> listaGenerica = new ArrayList<T>();

    public void adicionarMidia(T elemento){
        this.listaGenerica.add(elemento);
    }

    public List<T> obterListaMidias(){
        return listaGenerica;
    }
}
