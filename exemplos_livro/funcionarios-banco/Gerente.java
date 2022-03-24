
/**
 * Escreva uma descrição da classe Gerente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Gerente extends Funcionario
{
   private String senha;
   
   public Gerente(String nome, String cpf){
       super(nome, cpf);
   }
   
   public String getSenha(){
       return this.senha;
   }
   
   public String setSenha(){
       return this.senha;
   }
   
   // Sobrescrita de metodo
   public double getBonificacao() {
       double normal = super.getBonificacao();
       return normal + 1000;    
    }
   
   
   
}
