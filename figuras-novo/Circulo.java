
import java.awt.*;
import java.awt.geom.*;

/**
 * Escreva uma descrição da classe Circulo aqui.
 */
public class Circulo extends Figura implements AreaCalculavel
{
    private int raio;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void redimensionar(int proporcao){
        this.raio *= proporcao;
    }

    @Override
    public void desenhar() {
        Canvas canvas = Canvas.getCanvas();
       canvas.draw(this, "red", 
            new Ellipse2D.Double(x, y, raio*2, raio*2));
       canvas.wait(10);
    }

    @Override
    public int area() {
        return (int) Math.round(Math.PI * (Math.pow(raio, 2)));              
    }

}
