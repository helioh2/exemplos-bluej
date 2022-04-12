public abstract class FuncionarioAutenticavel extends Funcionario {
    
    public FuncionarioAutenticavel(String nome, String cpf){
        super(nome, cpf);
    }

    public boolean autentica() {
        return true;
    }
}
