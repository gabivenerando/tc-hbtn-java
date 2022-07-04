public class Contato implements Comparable<Contato>{
    private String nome;
    private String numero;
    private TipoNumero tiponumero;

    public Contato(String nome, String numero, TipoNumero tiponumero) {
        this.nome = nome;
        this.numero = numero;
        this.tiponumero = tiponumero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public TipoNumero getTiponumero() {
        return tiponumero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Contato)) {
            return false;
        }
        Contato contatos = (Contato) obj;
        return (this.nome == contatos.getNome());

    }

    @Override
    public String toString() {
        return this.getNome() + " -> " + this.numero + " (" + this.tiponumero + ")";
    }

    @Override
    public int compareTo(Contato outroContato) {
        Contato atual = (Contato) outroContato;
        return this.nome.compareTo(atual.getNome());
    }
}
