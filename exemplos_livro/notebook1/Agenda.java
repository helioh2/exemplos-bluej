import java.util.List;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe Agenda aqui.

 */
public class Agenda
{
    private List<String> anotacoes;
    
    public Agenda(){
        this.anotacoes = new ArrayList();
    }
    
    /**
     * O mesmo que o storeNote no livro
     */
    public void addAnotacao(String anotacao){
        anotacoes.add(anotacao);
    }
    
    /**
     * O mesmo que o numberOfNotes no livro
     */
    public int getTotalAnotacoes(){
        return this.anotacoes.size();
    }

    /**
     * O mesmo que showNote do livro
     */
    public void imprimeAnotacao(int indice){
        if (indice < 0 || indice >= this.getTotalAnotacoes()){ // Fora da lista
            // faz nada
        } else {
            System.out.println(anotacoes.get(indice));
        }
    }
    
    public void listarAnotacoes() {
        System.out.println(1+": "+anotacoes.get(0));
        //System.out.println(anotacoes.get(1));
        
    }
    
}
