
/**
 * Escreva uma descrição da classe Secretario aqui.
 */
public class Secretario extends Funcionario
{
    public Secretario(String nome, String cpf){
         super(nome, cpf);   
    }

    @Override
    public double getBonificacao() {
        // TODO Auto-generated method stub
        return this.salario * 0.15;
    }
    
       
}
