
/**
 * Escreva uma descrição da classe Quadrado aqui.
 */
public class Quadrado extends Figura implements AreaCalculavel
{
    private int tamanho; // tamanho do lado
   
    public Quadrado(int x, int y, int tamanho) {
        this.x = x;
        this.y = y;
        this.tamanho = tamanho;
    }

    //metodos acessadores


    public int getTamanho() {
        return tamanho;
    }

    public void mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void redimensionar(int proporcao){
        this.tamanho *= proporcao;
    }

    @Override
    public void desenhar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int area() {
        return tamanho*tamanho;
    }
   
   
   
}
