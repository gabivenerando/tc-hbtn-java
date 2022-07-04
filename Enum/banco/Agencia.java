import java.util.ArrayList;

public class Agencia {

    private String nome;

    private ArrayList<Cliente> clientes;


    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeCliente, double transacaoInicial) {
        Cliente cliente = buscarCliente(nomeCliente);

        if (cliente != null) {
            return false;
        }else{
            Cliente adicionarCliente = new Cliente(nomeCliente, transacaoInicial);
            clientes.add(adicionarCliente);
            return true;
        }

    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorDaTransacao) {
        Cliente cliente = buscarCliente(nomeCliente);

        if (cliente == null) {
            return false;
        }else{
            cliente.adicionarTransacao(valorDaTransacao);
            return true;
        }

    }

    public Cliente buscarCliente(String clienteBuscado) {

        for(int i = 0; i < this.clientes.size(); i++) {
            if(this.clientes.get(i).getNome().equals(clienteBuscado)) {
                return clientes.get(i);
            }
        }
        return null;
    }
}