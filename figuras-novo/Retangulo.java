import java.awt.*;

public class Retangulo extends Figura implements AreaCalculavel{

    protected int largura;
    protected int altura;

    public Retangulo(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void redimensionar(int proporcao){
        this.largura *= proporcao;
        this.altura *= proporcao;
    }

    public void setLargura(int largura){
        this.largura = largura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        Canvas canvas = Canvas.getCanvas();
       canvas.draw(this, "red", 
            new Rectangle(x, y, largura, altura));
       canvas.wait(10);
        
    }

    @Override
    public int area() {
        return largura * altura;
    }
    
}
