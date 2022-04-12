
/**
 * Escreva uma descrição da classe Engenheiro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Engenheiro extends Funcionario
{
    public Engenheiro(String nome, String cpf){
         super(nome, cpf);   
    }
    
    public double getBonificacao(){
        return this.salario * 0.18;
    }
}
