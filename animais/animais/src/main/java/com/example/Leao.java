package com.example;

public class Leao extends Animal implements Mamifero {
    

    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void barulho() {
        System.out.println("RROAAR");
        
    }
    @Override
    public void mover() {
        System.out.println("Movimenta-se com quatro patas");
        
    }

    @Override
    public String toString() {
        return "Leão " + nome + " anda de quatro patas e faz ROOAR";
    }

    public void mamar() {
        System.out.println("Leao mamando...");
    }

}
