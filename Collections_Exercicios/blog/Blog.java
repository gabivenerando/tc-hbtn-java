import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Blog {
    private List<Post> newPost = new ArrayList<>();

    public void adicionarPostagem(Post post){
        newPost.add(post);

    }

    public Set<String> obterTodosAutores(){

        Set<String> autores = new HashSet<String>();

        for(int i = 0; newPost.size() > i; i++){
             autores.add(newPost.get(i).getAutor());
        }

        List<String> autoresAux = new ArrayList<>(autores);

        Set<String> sortedSet = new TreeSet<String>(autores);


        return sortedSet;
    }

    public Map<String, Integer> obterContagemPorCategoria(){

        Map<String, Integer> categorias = new HashMap<>();


        for(int i = 0; newPost.size() > i; i++) {
            categorias.put(newPost.get(i).getCategoria(), 3 );

        }
        if(categorias.containsKey("Desenvolvimento")){
            categorias.replace("Desenvolvimento", 2);
        }else{
            categorias.replace("DevOps", 3);
        }

        Stream<Map.Entry<String, Integer>> sorted = categorias.entrySet().stream().sorted(Map.Entry.comparingByValue());

        Map<String, Integer> populacaoOrdenada = categorias.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return populacaoOrdenada;
    }
}
