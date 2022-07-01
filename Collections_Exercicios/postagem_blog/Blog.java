import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Blog {
    private List<Post> newPost = new ArrayList<>();

    public void adicionarPostagem(Post post) throws IllegalArgumentException{
        for (Post item : newPost) {
            if (item.getAutor().equals(post.getAutor()) && item.getTitulo().equals(post.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        newPost.add(post);
    }

    public Set<Autor> obterTodosAutores(){
        Set<Autor> autores = new TreeSet<>();

        for (Post item : newPost){
            autores.add(item.getAutor());
        }

        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> categorias = new TreeMap<>();
        List<Categorias> teste = new ArrayList<>();

        for (Post post : newPost) {
            teste.add(post.getCategoria());
        }

        for (Categorias categorias1 : teste) {
            Integer aux = Collections.frequency(teste, categorias1);
            categorias.put(categorias1, aux);
        }

        return categorias;
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> post = new TreeSet<>();
        for (Post item : newPost){

            if(item.getAutor().equals(autor)){
                post.add(item);
            }
        }
        return post;
    }

    public  Set<Post> obterPostsPorCategoria(Categorias categorias){
        Set<Post> posts = new TreeSet<>();

        for (Post item : newPost){
            if(item.getCategoria().compareTo(categorias) == 0){
                posts.add(item);
            }
        }
        return posts;
    }

    public  Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){

        Map<Categorias, Set<Post>> postCategorias = new TreeMap<>();
        Set<Post> postagem;

        for (Post item : newPost){
            postagem = obterPostsPorCategoria(item.getCategoria());

                postCategorias.put(item.getCategoria(), postagem);
        }
        return postCategorias;
    }

    public  Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> postAutor = new TreeMap<>();

        for (Post item : newPost){
            postAutor.putIfAbsent(item.getAutor(), new TreeSet<>());
            postAutor.get(item.getAutor()).add(item);
        }
        return postAutor;
    }

}
