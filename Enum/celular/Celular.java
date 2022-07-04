import java.util.*;

public class Celular {
    private ArrayList<Contato> contatos = new ArrayList<>();


    public int obterPosicaoContato(String nome){

        int verificacao = 0;

        if(contatos.size() == 0){
            return  verificacao = -1;
        }



        for(Contato nomes : contatos){
            if(nomes.getNome().equals(nome)){

                return verificacao = nomes.getNome().indexOf(nome) ;
            }else{
                verificacao = -1;
            }
        }



        return verificacao;
    }

    public void adicionarContato(Contato contatos) throws Exception{

        int verificacao = obterPosicaoContato(contatos.getNome());

        if(verificacao == -1 || verificacao == 0){
            this.contatos.add(contatos);
        }else{
            throw new Exception("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        int verificacaoContatoAntigo = obterPosicaoContato(contatoAntigo.getNome());

        if(verificacaoContatoAntigo != -1){

        }else{
            throw new Exception("Nao foi possivel modificar contato. Contato nao existe");
        }

        int verificacaoNovoContato = obterPosicaoContato(novoContato.getNome());


        if(verificacaoContatoAntigo != -1 && verificacaoNovoContato != -1 && contatoAntigo.getNumero() != novoContato.getNumero() && contatoAntigo.getNome() == novoContato.getNome()) {
            this.contatos.remove(contatoAntigo);
            this.contatos.add(novoContato);

        }else{
            throw new Exception("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
    }

    public void removerContato(Contato contatos) throws Exception {
        int verficacao = obterPosicaoContato(contatos.getNome());

        if(verficacao != -1){
            this.contatos.remove(contatos);
        }else{
            throw new Exception("Nao foi possivel remover contato. Contato nao existe");
        }
    }

    public void listarContatos(){

        Collections.sort(contatos);

        for(Contato nomes : contatos){
            System.out.println(nomes);
        }

    }
}
