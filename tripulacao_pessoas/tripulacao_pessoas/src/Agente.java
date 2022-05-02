public class Agente extends PessoaDecorator {
    
    public Agente(IPessoa pessoa) {
        super(pessoa);
    }

    @Override
    public String getUsername() {
        return this.pessoa.getUsername() + "Ag";
    }
}
