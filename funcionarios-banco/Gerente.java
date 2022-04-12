
/**
 * Escreva uma descrição da classe Gerente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Gerente extends Funcionario implements Autenticavel
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
       double normal = this.salario * 0.1;
       return normal + 1000;    
    }

    public boolean autentica() {
        // TODO
        return true;
    }
   
   
   
}
