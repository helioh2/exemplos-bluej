package com.example;

public class Leao extends Animal implements Mamifero {
    

    public Leao(String nome) {
        super(nome);
    }

    // SOBRECARGA DE CONSTRUTOR
    public Leao(String nome, int id) {
        super(nome, id);
    }

    @Override  //SOBRESCRITA
    public void barulho() {
        System.out.println("RROAAR");
        
    }
    @Override
    public void mover() {
        System.out.println("Movimenta-se com quatro patas 10 passos");
        
    }


    //SOBRECARGA DE MÉTODO
    public void mover(int passos) {
        System.out.println("Movimenta-se com quatro patas "+ passos + " passos");
        
    }

    //SOBRECARGA DE MÉTODO
    public void mover(int passos, boolean paraTras) {
        if (paraTras){
            System.out.println("Movimenta-se para trás com quatro patas "+ passos + " passos");
        } else {
            System.out.println("Movimenta-se com quatro patas "+ passos + " passos");
        }
    }

    @Override
    public String toString() {
        return "Leão " + nome + " anda de quatro patas e faz ROOAR";
    }

    @Override //SOBRESCRITA
    public void print() {
        System.out.println("Printzinho especial do Leão");
        super.print();
    }

    public void mamar() {
        System.out.println("Leao mamando...");
    }

}
