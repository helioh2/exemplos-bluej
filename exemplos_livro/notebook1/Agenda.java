import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

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
    
    public void removeAnotacao(String anotacao){
        anotacoes.remove(anotacao);
    } 
    
    public void removeAnotacao(int indice){
        if (indice >= 1 && indice < this.getTotalAnotacoes()+1){ // Dentro da lista
            anotacoes.remove(indice-1);
        } else {
            System.out.println("ERRO: Indice fora da lista");
        }
        
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
        if (indice >= 1 && indice < this.getTotalAnotacoes()+1){ // Dentro da lista
            System.out.println(anotacoes.get(indice-1));
        } else {
            System.out.println("ERRO: Indice fora da lista");
        }
    }
    
    public void listarAnotacoes() {
        
        int index = 0; // começando do 0 (primeiro elemento)
        int ultimo_index = anotacoes.size() - 1;
        
        while (index <= ultimo_index){  // Ex: 5 <= 4 ? = false
            System.out.println((index+1) + ": " + anotacoes.get(index));
            index++; //incrementa o valor do index. Ex: index=0 -> index=1 ; index=1 -> index=2; index=4 -> index=5
            //index = index + 1;
        }   
         
        //System.out.println(anotacoes.get(0));
        //System.out.println(anotacoes.get(1));
        //System.out.println(anotacoes.get(2));
        //System.out.println(anotacoes.get(3)); // 4 elementos -> vai ate o 3
        
        
    }

    
     public void listarAnotacoes2() {
        
        for (int index=0; index <= anotacoes.size()-1; index++){
            System.out.println(anotacoes.get(index));
        }
              
    }
    
    public void listarAnotacoes3() {
        
        for (String anotacao: anotacoes){ // para cada anotaçao dentro da lista anotacoes
            System.out.println(anotacao);
        }
              
    }
    
    
    public void listarAnotacoes4() {
        
        Iterator<String> it = anotacoes.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }   
              
    }
    
    public void listarAnotacoes5() {
        
        anotacoes.forEach(anotacao -> System.out.println(anotacao));
              
    }
    
}
