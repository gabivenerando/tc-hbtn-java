package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {

        double calculoFinal;

        if(peso > 5000){
            calculoFinal = valor * 12 / 100;
        }else{
            calculoFinal = valor * 4 / 100;
        }

        Frete frete = new Frete(calculoFinal, obterTipoProvedorFrete());

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
