package br.ufpr.banco;

import br.ufpr.banco.cliente.Cliente;
import br.ufpr.banco.conta.Conta;
import br.ufpr.banco.conta.LimiteUltrapassadoException;
import br.ufpr.banco.conta.SaldoInsuficienteException;
import br.ufpr.banco.conta.TransferenciaInvalidaException;


public class App 
{
    public static void main( String[] args )
    {
        Cliente cliente1 = new Cliente("Fulano");
        Conta conta1 = new Conta(cliente1);
        conta1.setLimite(1000);

        Cliente cliente2 = new Cliente("Beltrano");
        Conta conta2 = new Conta(cliente2);
        conta2.setLimite(2000);

        try {
            conta1.depositar(500);
        } catch (LimiteUltrapassadoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta1);
        
        try {
            conta2.depositar(1000);
        } catch (LimiteUltrapassadoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta2);

        try {
            conta1.sacar(700);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta1);

        try {
            conta2.transferir(conta1, 700);
        } catch (TransferenciaInvalidaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta1);
        System.out.println(conta2);

        try {
            conta1.transferir(conta2, 700);
        } catch (TransferenciaInvalidaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta1);
        System.out.println(conta2);
        

    }
}
