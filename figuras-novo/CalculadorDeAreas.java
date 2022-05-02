import java.util.List;

public class CalculadorDeAreas {

    public static int somaAreas(List<AreaCalculavel> figuras){
        int soma = 0;
        for (AreaCalculavel fig: figuras){
            soma += fig.area();
        }
        return soma;
    }
    




    
    // ESBOÇO DA VERSÃO SEM O USO DE POLIMORFISMO:
    public static int somaAreasSemPolimorfismo(List<Object> figuras){
        int soma = 0;
        for (Object fig: figuras){
            if (fig instanceof Quadrado) {
                //soma += fig.areaQuadrado();
            } else if (fig instanceof Retangulo) {
                //...
            } else if (fig instanceof Triangulo) {
                //... dkfkldjlkfj
            } else if (fig instanceof Elipse) {
                //...
            }
            //....
            
        }
        return soma;
    }

}
