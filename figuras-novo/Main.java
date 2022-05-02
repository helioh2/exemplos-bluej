import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Canvas.getCanvas();

        Retangulo retangulo = new Retangulo(20, 30, 70, 80);
        retangulo.desenhar();

        Circulo circulo = new Circulo(20, 30, 100);
        circulo.desenhar();

        

        //circulo.mover(100, 50);

        Ponto ponto = new Ponto(20, 200);

        ponto.desenhar();

        List<AreaCalculavel> figuras = Arrays.asList(retangulo, circulo);
        int resultado = CalculadorDeAreas.somaAreas(figuras);
        System.out.println(resultado);

        //Figura figura1 = new Figura(); NÃO FUNCIONA
        
    }
    
}
