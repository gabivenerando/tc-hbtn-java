package workflowFixacao;

import workflowFixacao.atividades.CarregarVideo;
import workflowFixacao.atividades.CodificarVideo;
import workflowFixacao.atividades.EnviarEmail;
import workflowFixacao.atividades.ModificarStatusVideo;

import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("pt", "BR"));

        MaquinaWorkflow maquinaWorkflow = new MaquinaWorkflow();

        Workflow workflowEncodificarVideos = new Workflow();

        workflowEncodificarVideos.registrarAtividade(new CarregarVideo());
        workflowEncodificarVideos.registrarAtividade(new CodificarVideo());
        workflowEncodificarVideos.registrarAtividade(new EnviarEmail());

        maquinaWorkflow.executar(workflowEncodificarVideos);

        System.out.println("-----");

        Workflow workflowVideos = new Workflow();

        workflowVideos.registrarAtividade(new CarregarVideo());
        workflowVideos.registrarAtividade(new EnviarEmail());

        maquinaWorkflow.executar(workflowVideos);

        System.out.println("-----");

        Workflow workflowVideosStatus = new Workflow();

        workflowVideosStatus.registrarAtividade(new CarregarVideo());
        workflowVideosStatus.registrarAtividade(new ModificarStatusVideo());
        workflowVideosStatus.registrarAtividade(new EnviarEmail());

        maquinaWorkflow.executar(workflowVideosStatus);
    }

}
