
/**
 * Escreva uma descrição da classe Lampada aqui.
 */
public class Lampada
{
    private Boolean acesa; // true/false
    private String nome;
    
    public Lampada(){
        this.acesa = false;
    }
    
    public void acender(){
        this.acesa = true;
    }
    
    public void apagar(){
        this.acesa = false;
    }
    
    
}
