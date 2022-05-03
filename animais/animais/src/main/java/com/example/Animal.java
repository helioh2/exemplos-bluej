package com.example;

public abstract class Animal implements Comparable<Animal> {
    
    protected String nome;
    protected int id;

    private static int seqId = 0;

    private synchronized static int novoId(){
        seqId++;
        return seqId;
    }

    public Animal(String nome) {
        this.nome = nome;
        this.id = novoId();
    }

    // SOBRECARGA DE CONSTRUTOR
    public Animal(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public abstract void barulho();
    public abstract void mover();

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Animal other) {
        String comparadoThis = this.nome + this.id;  // "Leviano1" > "Leviano5"
        String comparadoOther = other.nome + other.id;
        if (comparadoThis.compareTo(comparadoOther) > 0){
            return 1;
        } else if (comparadoThis.compareTo(comparadoOther) < 0){
            return -1;
        } else {
            return 0;
        }
    }

    
}
