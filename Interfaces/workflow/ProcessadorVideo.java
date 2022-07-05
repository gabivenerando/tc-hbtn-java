import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais = new ArrayList<>();;

    public void registrarCanal(CanalNotificacao canais){
        this.canais.add(canais);
    }

    public void processar(Video video){
        for(CanalNotificacao canal : canais){
            Mensagem mensagem = new Mensagem(video.getArquivo() + " - " + video.getFormatoVideo(), TipoMensagem.LOG);
            canal.notificar(mensagem);
        }

    }
}
