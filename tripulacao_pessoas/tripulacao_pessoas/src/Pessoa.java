public class Pessoa implements IPessoa {

    private String nome;
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
