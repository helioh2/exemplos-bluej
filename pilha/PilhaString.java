import java.util.List;
import java.util.LinkedList;

/**
 * Uma pilha de string
 */
public class PilhaString
{
    private LinkedList<String> lista;
    
    public PilhaString(){
        lista = new LinkedList();
    }
    
    /**
     * Recebe uma string e coloca no topo da pilha.
     *
     */
    public void empilhar(String novoItem){
        lista.addLast(novoItem);
    }
    
    /**
     * Retirar o elemento do topo da pilha e
     * retornar esse elemento
     */
    public String desempilhar(){
        if (this.isVazia()){
            return "ERRO";
        }
        String ultimo = this.lista.removeLast();
        return ultimo;

    }
    
    public String getTopo(){
        if (this.isVazia()){
            return "ERRO";
        }
        return lista.getLast();
    }
    
    public boolean isVazia() {
        return lista.isEmpty();
    }
        
    
    
}
