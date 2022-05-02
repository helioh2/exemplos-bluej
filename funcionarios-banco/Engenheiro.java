
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
    
    @Override
    public double getBonificacao(){  // SOBRESCRITA OU REESCRITA
        double bonificacao1 = super.getBonificacao();
        return bonificacao1 + this.salario*0.5;
    }
}
