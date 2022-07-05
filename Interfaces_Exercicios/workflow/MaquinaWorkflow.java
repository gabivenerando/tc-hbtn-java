package workflowFixacao;

import workflowFixacao.atividades.Atividade;
public class MaquinaWorkflow {


    public void executar(Workflow workflow){
        for(Atividade atividade : workflow.getWorkflow()){
                atividade.executar();
        }

    }


}
