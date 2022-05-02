public final class Pessoa implements IPessoa {

    private static int seqId = 0;

    public static String zueira = "Opa!!";

    private String nome;
    private int id;
    private String endereco;
    private Sexo sexo;

    private synchronized static int gerarId(){
        seqId++;
        return seqId;
    }

    public Pessoa() {
        this.id = gerarId();
    }

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

    @Override
    public String getUsername() {
        return this.nome + this.id;
    }
    
}
