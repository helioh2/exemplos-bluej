import java.util.List;
import java.util.ArrayList;

/**
 * Representa um comodo.
 */
public class Comodo
{
    private Lampada lampada; // = null
    private List<Movel> moveis; // = null
    private String nome;
    
    public Comodo(String nome){
        this.moveis = new ArrayList(); 
        // ArrayList = lista implementada como um vetor de tamanho dinamico
        this.nome = nome;
    }
    
    public void setLampada(Lampada lampada){
        this.lampada = lampada;
    }
    
    public void addMovel(Movel movel){
        this.moveis.add(movel);
    }
    
    public void iluminar(){
        this.lampada.acender();
    }
    
    //public void removeMovel(
}
