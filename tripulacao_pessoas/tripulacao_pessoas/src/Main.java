import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        
        // Pessoa p1 = new Pessoa();

        // //IPessoa ip1 = new IPessoa(); // NAO FUNCIONA, POIS É INTERFACE (ABSTRATA)

        // Tripulacao trip1 = new Tripulacao(p1); // INSTANCIANDO CLASSE CONCRETA
        // trip1.setNome("Maria");

        // System.out.println(trip1.getNome());

        // Agente ag1 = new Agente(p1);

        // System.out.println(ag1.getNome());

        // List<IPessoa> pessoas = Arrays.asList(trip1, ag1);

        // Pessoa p2 = new Pessoa();
        // p2.setNome("Jose");

        // System.out.println(Pessoa.zueira);

        Pessoa p1 = new Pessoa();
        p1.setNome("Maria");
        p1.setEndereco("Rua dos Bobos, nº 0");

        Pessoa p2 = new Pessoa();
        p2.setNome("José");
        p2.setEndereco("Rua dos Tolos, nº 0");

        
        Tripulacao trip1 = new Tripulacao(p1);
        System.out.println(trip1.getNome());

        Agente agtrip1 = new Agente(trip1);
        System.out.println(agtrip1.getNome());

        System.out.println(p1.getUsername());
        System.out.println(p2.getUsername());
        
        System.out.println(agtrip1.getUsername()); // Maria1TripAg

        Passageiro pass1 = new Passageiro(p2);

        System.out.println(pass1.getUsername()); //Jose2Pass


        IPessoa p3 = new Agente( new Tripulacao( new Passageiro ( new Pessoa())));

        p3.setNome("Fulano");

    }
    
}
