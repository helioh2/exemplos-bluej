import java.util.List;
import java.util.LinkedList;

/**
 * Pilha para objetos genericos (para objetos de qualquer tipo)
 * Tipo de dado parametrizado
 */
public class Pilha<T>
{
    
    private LinkedList<T> lista;
    
    public Pilha(){
        lista = new LinkedList();
    }
    
    /**
     * Recebe um objeto e coloca no topo da pilha.
     *
     */
    public void empilhar(T novoItem){
        lista.addLast(novoItem);
    }
    
    /**
     * Retirar o elemento do topo da pilha e
     * retornar esse elemento
     */
    public T desempilhar() throws PilhaVaziaException{
        
        if (this.isVazia()){
            throw new PilhaVaziaException("Impossivel desempilhar de pilha vazia.");
        }
        T ultimo = this.lista.removeLast();
        return ultimo;

    }
    
    public T getTopo(){
        if (this.isVazia()){
            return null;
        }
        return lista.getLast();
    }
    
    public boolean isVazia() {
        return lista.isEmpty();
    }

}
