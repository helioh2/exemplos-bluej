import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void main(String[] args){
        
        // List<String> compras = new ArrayList();
        
        // compras.add("arroz");
        // compras.add("batata");
        // compras.add("feijao");
        
        // System.out.println(compras.get(1));
        
        // //compras.remove(1);
                
        // System.out.println("Lista:");
        // for (int i=0; i < compras.size(); i++){ // iteraçao estilo C (por indice)
            // System.out.println(compras.get(i));
        // }
        // System.out.println("\n");
        
        // System.out.println("Lista com iterator:");
        // // Iteraçao com Iterator
        // Iterator<String> it =  compras.iterator();
        // while (it.hasNext()){
            // String item = it.next();
            // System.out.println(item);
        // }
        
        
        // System.out.println("Lista com for (iterator implicito):");
        // for (String item: compras){ //for each item in compras (para cada item em compras)
            // System.out.println(item);
        // }
        
        // System.out.println("Lista com foreach:");
        // compras.forEach(item -> System.out.println(item));
        
        
        // Set<String> compras2 = new TreeSet(); // conjunto
        
        // compras2.add("Linguica");
        // compras2.add("Carne moida");
        // compras2.add("Frango");
        
        // System.out.println("Lista com iterator:");
        // // Iteraçao com Iterator
        // Iterator<String> it2 =  compras2.iterator();
        // while (it2.hasNext()){
            // String item = it2.next();
            // System.out.println(item);
        // }
        
        
        // System.out.println("Lista com for (iterator implicito):");
        // for (String item: compras2){ //for each item in compras (para cada item em compras)
            // System.out.println(item);
        // }
        
        
        Comodo sala = new Comodo("sala");
        Comodo quarto = new Comodo("quarto");
        
        System.out.println(sala);
        System.out.println(quarto);
        
        Comodo x = sala;
        
        System.out.println(x);
        
        
        
        
        
        
        
    }
}
