import java.awt.geom.*;

public class Ponto extends Figura {

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void redimensionar(int proporcao) {
        // FAZ NADA     
    }

    @Override
    public void desenhar() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", 
             new Ellipse2D.Double(x, y, 10, 10));
        canvas.wait(10);
        
    }
    
}
 