import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();

        Tripulacao trip1 = new Tripulacao(p1);
        trip1.setNome("Maria");

        System.out.println(trip1.getNome());

        Agente ag1 = new Agente(p1);

        System.out.println(ag1.getNome());

        List<IPessoa> pessoas = Arrays.asList(trip1, ag1);

        


        
    }
    
}
