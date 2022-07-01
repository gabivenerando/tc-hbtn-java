import java.util.Objects;

public class Post implements Comparable <Post>{

    private Autor autor;
    private String titulo;
    private String corpo;
    private  Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(autor, post.autor) && Objects.equals(titulo, post.titulo) && Objects.equals(corpo, post.corpo) && categoria == post.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, titulo, corpo, categoria);
    }

    @Override
    public String toString() {
        return this.titulo;
    }

    @Override
    public int compareTo(Post outroObjeto) {
        if(this.titulo.equals(outroObjeto.getTitulo())){
            return 0;
        }

        if(this.titulo.charAt(0) > outroObjeto.getTitulo().charAt(0)){
            return 1;
        }

        if(this.titulo.charAt(0) < outroObjeto.getTitulo().charAt(0)){
            return -1;
        }
        return this.titulo.compareTo(outroObjeto.getTitulo());
    }
}
