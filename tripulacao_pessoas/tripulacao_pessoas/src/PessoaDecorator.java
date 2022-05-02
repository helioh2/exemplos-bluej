public abstract class PessoaDecorator implements IPessoa {

    protected IPessoa pessoa; // DEPENDENCIA DE CLASSE ABSTRATA/INTERFACE (MASSA!)

    public PessoaDecorator(IPessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String getEndereco() {
        return this.pessoa.getEndereco();
    }

    @Override
    public String getNome() {
        return this.pessoa.getNome();
    }

    @Override
    public void setEndereco(String endereco) {
        this.pessoa.setEndereco(endereco);
    }

    @Override
    public void setNome(String nome) {
        this.pessoa.setNome(nome);
        
    }

    
}
