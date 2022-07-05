package resumoPedido.provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double calculoFinal;

        if(peso > 2000){
            calculoFinal = valor * 7 / 100;
        }else{
            calculoFinal = valor * 4.5 / 100;
        }

        Frete frete = new Frete(calculoFinal, obterTipoProvedorFrete());

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
