import java.io.PrintStream;

public class Sms implements CanalNotificacao{
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[SMS]" +  " {" + mensagem.getTipoMensagem() + "} - " + mensagem.getTexto());;
    }
}
