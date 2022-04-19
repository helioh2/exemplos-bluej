public class Agente implements IPessoa {
    
    private Pessoa pessoa;

    public Agente(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getEndereco() {
        return this.pessoa.getEndereco();
    }

    public String getNome() {
        return this.pessoa.getNome();
    }

    public void setEndereco(String endereco) {
        this.pessoa.setEndereco(endereco);
    }
    
    public void setNome(String nome) {
        this.pessoa.setNome(nome);
    }

}
