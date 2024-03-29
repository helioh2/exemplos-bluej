package com.example;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void amamentarTodos(List<Mamifero> mamiferos) {
        for (Mamifero mamiferoAtual: mamiferos) {
            mamiferoAtual.mamar();
        }
    }

    public static void main( String[] args )
    {
        //Animal animal1 = new Animal();

        Animal leao1 = new Leao("Leviano");
        //leao1.barulho();
        //System.out.println(leao1);

        Leao leao2 = new Leao("Vigarista");
        //leao1.barulho();
        //System.out.println(leao2);
        leao2.print();

        leao2.mover();
        leao2.mover(100);
        leao2.mover(100, true);
        leao2.mover(100, false);

        Tatu tatu1 = new Tatu("Fuleco");

        Galinha galinha1 = new Galinha("Pintadinha");


        Leao leao3 = new Leao("Simba", 100);
        //tatu1.print();

        // ArrayList<Animal> animais = new ArrayList<Animal>();
        // animais.add(leao1);
        // animais.add(leao2);

        List<Animal> animais = Arrays.asList(leao1, leao2, tatu1, galinha1);

        animais.sort(null);

        for (Animal animal: animais) {
            System.out.println(animal);
        }
    }
}
