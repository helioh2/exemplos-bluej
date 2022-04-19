import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //Canvas.getCanvas();

        // Retangulo retangulo = new Retangulo(20, 30, 70, 80);
        // retangulo.desenhar();

        // Circulo circulo = new Circulo(20, 30, 100);
        // circulo.desenhar();

        

        // //circulo.mover(100, 50);

        // Ponto ponto = new Ponto(20, 200);

        // ponto.desenhar();

        // List<AreaCalculavel> figuras = Arrays.asList(retangulo, circulo);
        // int resultado = CalculadorDeAreas.somaAreas(figuras);
        // System.out.println(resultado);


        Pessoa p1 = new Pessoa();

        Tripulacao trip1 = new Tripulacao(p1);
        trip1.setNome("Maria");

        System.out.println(trip1.getNome());

        Agente ag1 = new Agente(p1);

        System.out.println(ag1.getNome());

        List<IPessoa> pessoas = Arrays.asList(trip1, ag1);

        


        
    }
    
}
