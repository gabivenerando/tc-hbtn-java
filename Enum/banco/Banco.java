import java.util.ArrayList;

public class Banco {

    private String nome;

    private ArrayList<Agencia> agencias;


    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }


    public boolean adicionarAgencia(String nomeAgencia) {

        boolean verificacao = false;

        Agencia agencia = buscarAgencia(nomeAgencia);

        if(agencia != null) {
            return verificacao = false;
        }else{
            Agencia adicionarAgencia = new Agencia(nomeAgencia);
            agencias.add(adicionarAgencia);
            return verificacao = true;
        }

    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorInicial) {

        boolean verificacao = false;

        Agencia agencia = buscarAgencia(nomeAgencia);

        if(agencia == null) {
            return verificacao = false;
        }else{
            agencia.novoCliente(nomeCliente, valorInicial);
            agencia.adicionarTransacaoCliente(nomeCliente, valorInicial);
           return verificacao = true;
        }
    }


    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorDaTransacao) {

        boolean verificacao = false;

        Agencia agencia = buscarAgencia(nomeAgencia);

        if(agencia == null) {
            return false;
        }else{
            agencia.adicionarTransacaoCliente(nomeCliente, valorDaTransacao);
            return verificacao = true;
        }

    }

    private Agencia buscarAgencia(String nomeAgencia) {

        for(int i = 0; i < this.agencias.size(); i++) {
            if(this.agencias.get(i).getNome().equals(nomeAgencia)) {
                return agencias.get(i);
            }
        }
        return null;
    }


    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {

        boolean verificacao = false;

        Agencia agenciaLocalizada = buscarAgencia(nomeAgencia);

        if (agenciaLocalizada == null) {
            return false;
        }

        for (int i = 0; i < agenciaLocalizada.getClientes().size(); i++) {
            Cliente clienteEncontrado = agenciaLocalizada.getClientes().get(i);
            System.out.println("Cliente: " + clienteEncontrado.getNome() + " [" + (i + 1) + "]");

            if (imprimirTransacoes) {
                for (int j = 0; j < clienteEncontrado.getTransacoes().size(); j++) {
                    System.out.println("  [" + (j + 1) + "] valor " + clienteEncontrado.getTransacoes().get(j));
                }
            }

        }

        return true;
    }
}