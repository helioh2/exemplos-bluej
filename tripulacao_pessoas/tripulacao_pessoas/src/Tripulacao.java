public class Tripulacao extends PessoaDecorator {

    public Tripulacao(IPessoa pessoa) {
        super(pessoa);
    }
    
    @Override
    public String getUsername() {
        return this.pessoa.getUsername() + "Trip";
    }
   

}
