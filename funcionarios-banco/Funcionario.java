/**
 * Representa um funcionario do banco
 */
public abstract class Funcionario
{
    protected String nome;
    protected String cpf;
    protected double salario;
    
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = 0;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;    
    }
    
    public void pagar(double valor){
        // ...TODO: PAGAR FUNCIONARIO (EX: LANÇAR NA FOLHA DE PAGAMENTO)
        
        System.out.println("Funcionario "+this.nome+" pago com sucesso! VALOR: "+valor);
    }
    
    public abstract double getBonificacao(); // PRECISO IMPLEMENTA-LO NAS CLASSES FILHAS
    
    
    
}
