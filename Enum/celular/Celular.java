import java.util.*;

public class Celular {
    private ArrayList<Contato> contato = new ArrayList<Contato>();


    public int obterPosicaoContato(String nome){

        int verificacao = 0;

        if(contato.size() == 0){
            return  verificacao = -1;
        }



        for(Contato nomes : contato){
            if(nomes.getNome().equals(nome)){

               return verificacao = nomes.getNome().indexOf(nome) ;
            }else{
                verificacao = -1;
            }
        }



        return verificacao;
    }

    public void adicionarContato(Contato contato) throws Exception{

        int verificacao = obterPosicaoContato(contato.getNome());

        if(verificacao == -1 || verificacao == 0){
            this.contato.add(contato);
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
               this.contato.remove(contatoAntigo);
               this.contato.add(novoContato);

        }else{
            throw new Exception("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
    }

    public void removerContato(Contato contato) throws Exception {
            int verficacao = obterPosicaoContato(contato.getNome());

            if(verficacao != -1){
                this.contato.remove(contato);
            }else{
                throw new Exception("Nao foi possivel remover contato. Contato nao existe");
            }
    }

    public void listarContatos(){

        Collections.sort(contato);

        for(Contato nomes : contato){
            System.out.println(nomes);
        }

    }
}


