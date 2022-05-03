package br.ufpr.banco.conta;

import br.ufpr.banco.cliente.Cliente;

public class Conta {

    private static int numeroSeq = 0;

    private int numero;
    private Cliente titular;
    private double saldo;
    private double limite;

    /**
     * Método estático que gera um novo número de conta
     * @return
     */
    private synchronized static int novoNumero() {
        numeroSeq++;
        return numeroSeq;
    }

    /**
     * Construtor que recebe somente o cliente titular e gera um novo número de conta
     * @param titular
     */
    public Conta(Cliente titular) {
        this.numero = novoNumero();
        this.titular = titular;
    }

    /**
     * Construtor que recebe o cliente titular e um número de conta já existente
     * @param numero
     * @param titular
     */
    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
    }
  

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void depositar(double valor) throws LimiteUltrapassadoException, IllegalArgumentException {

        if (valor < 0) {
            throw new IllegalArgumentException("Valor do deposito não pode ser menor que zero");
        }

        if (this.saldo + valor > this.limite){
            throw new LimiteUltrapassadoException("Limite de saldo da conta "+this.numero+" ultrapassado");
        }

        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException, IllegalArgumentException {

        if (valor < 0) {
            throw new IllegalArgumentException("Valor do saque não pode ser menor que zero");
        }

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo da conta "+this.numero+" insuficiente, tente um valor menor");
        }

        this.saldo -= valor;
    }

    public void transferir(Conta outra, double valor) {
        try {
            this.sacar(valor);
            outra.depositar(valor);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (SaldoInsuficienteException e) {
            throw new TransferenciaInvalidaException(e.getMessage());
        } catch (LimiteUltrapassadoException e) {
            this.depositar(valor); //desfazendo operação this.sacar(valor)
            throw new TransferenciaInvalidaException(e.getMessage());
        }
    }

    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }

    @Override
    public String toString() {
        String str = "\n----------------------\n";
        str += "Número da conta: "+this.numero+"\n";
        str += "Nome do titular: "+this.titular.getNome()+"\n";
        str += "Saldo: "+this.saldo+"\n";
        str += "Limite: "+this.limite+"\n";
        str += "----------------------------\n";
        return str;
    }

}
