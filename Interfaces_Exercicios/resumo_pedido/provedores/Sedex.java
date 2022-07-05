package resumoPedido.provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {

        double calculoFinal;

        if(peso > 1000){
            calculoFinal = valor * 10 / 100;
        }else{
            calculoFinal = valor * 5 / 100;
        }

        Frete frete = new Frete(calculoFinal, obterTipoProvedorFrete());

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
