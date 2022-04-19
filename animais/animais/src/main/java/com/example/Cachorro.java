package com.example;

public class Cachorro extends Animal implements Mamifero {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void barulho() {
        System.out.println("AU AU");
        
    }

    @Override
    public void mover() {
        System.out.println("Movimenta-se com quatro patas");
        
    }

    @Override
    public void mamar() {
        // TODO Auto-generated method stub
        
    }

    
}
