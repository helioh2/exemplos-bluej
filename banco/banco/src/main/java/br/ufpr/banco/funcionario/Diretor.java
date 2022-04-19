package br.ufpr.banco.funcionario;

import br.ufpr.banco.sistemainterno.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel{

    public Diretor(String nome, String cpf){
        super(nome, cpf);
    }

    @Override
    public double getBonificacao() {
        return this.salario*0.2;
    }

    public boolean autentica() {
        return true;
    }
    
}
