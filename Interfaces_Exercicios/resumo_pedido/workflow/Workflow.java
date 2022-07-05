package workflowFixacao;

import workflowFixacao.atividades.Atividade;

import java.util.ArrayList;

public class Workflow {
    ArrayList<Atividade> workflow = new ArrayList<>();

    public void registrarAtividade(Atividade atividade){
        this.workflow.add(atividade);
    }

    public ArrayList<Atividade> getWorkflow() {
        return workflow;
    }

}
