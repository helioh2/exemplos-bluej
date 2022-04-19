package br.ufpr.banco.cliente;

import br.ufpr.banco.sistemainterno.Autenticavel;

public class Cliente implements Autenticavel {
    
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean autentica() {
        return true;
    }

}
