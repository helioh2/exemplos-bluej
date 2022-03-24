
/**
 * Escreva uma descrição da classe ControleDeBonificacoes aqui.
 */
public class ControleDeBonificacoes
{
    private int totalBonificacoes; // = 0
    
    // CONSTRUTOR PADRAO (VAZIO)
    
    public void registrar(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.totalBonificacoes += bonificacao;
    }
    
    public int getTotalBonificacoes(){
        return this.totalBonificacoes;
    }
    
}
