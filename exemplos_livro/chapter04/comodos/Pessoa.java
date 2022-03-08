
/**
 * Representa uma pessoa
 * 
 */
public class Pessoa
{
    private Comodo comodoAtual; // = null
    private String nome;  // = ""
    
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void entra(Comodo comodo){
        this.comodoAtual = comodo;
    }
    
    public void sai(){
        this.comodoAtual = null;
    }
}
