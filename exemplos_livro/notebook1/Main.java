
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void main(String[] args){
        Agenda agenda1 = new Agenda();
        //agenda1.listarAnotacoes();
        agenda1.addAnotacao("Lavar roupa");
        agenda1.addAnotacao("Lavar louça");
        agenda1.addAnotacao("Lavar o banheiro");
        agenda1.addAnotacao("Lavar a calçada");
        
        for (int i=0; i < 10; i++){
            agenda1.addAnotacao("Anotacao "+(i+4));
        }
        
        //agenda1.listarAnotacoes();
        
        agenda1.removeAnotacao("Lavar o banheiro");
        
        agenda1.listarAnotacoes();
        
        agenda1.imprimeAnotacao(1);
        
        agenda1.removeAnotacao(3);
        
        agenda1.listarAnotacoes();
        
        
    }
}
