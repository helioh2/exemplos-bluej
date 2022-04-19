
/**
 * Escreva uma descrição da classe Quadrado aqui.
 */
public class Quadrado extends Retangulo implements AreaCalculavel
{
    //private int tamanho; // tamanho do lado
   
    public Quadrado(int x, int y, int tamanho) {
        super(x, y, tamanho, tamanho);
    }

    //metodos acessadores


    public int getTamanho() {
        return largura;
    }


    @Override
    public void desenhar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setLargura(int largura) {
        this.largura = largura;
        this.altura = largura;
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
        this.largura = altura;
    }


   
   
   
}
