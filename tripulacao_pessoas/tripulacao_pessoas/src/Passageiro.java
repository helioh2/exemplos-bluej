public class Passageiro extends PessoaDecorator {
    
    public Passageiro(IPessoa pessoa) {
        super(pessoa);
    }

    @Override
    public String getUsername() {
        return this.pessoa.getUsername() + "Pass";
    }
}
