import java.util.List;
import java.util.Arrays;

/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void main(String[] args){
        Pilha<Integer> pilhaInteiros = new Pilha();
        pilhaInteiros.empilhar(10);
        pilhaInteiros.empilhar(20);
        
        System.out.println(pilhaInteiros.getTopo());
        
        //pilhaInteiros.empilhar("arroz");
        
        Pilha<String> pilhaStrings = new Pilha();
        pilhaStrings.empilhar("arroz");
        //pilhaStrings.empilhar(10);
        
        
        Pilha<List> pilhaListas = new Pilha();
        pilhaListas.empilhar(Arrays.asList(1,2,3,4));
        pilhaListas.empilhar(Arrays.asList("arroz","feijao","macarrao"));
        
        System.out.println(pilhaListas.getTopo());
        
        try {
            pilhaListas.desempilhar();
        } catch (PilhaVaziaException e) {
            System.out.println("ERRO: " + e.getMessage());
            // Ex: fechar arquivo que foi aberto (ou fechar conexao com banco de dados)
        }
        
        System.out.println(pilhaListas.getTopo());
        
        Pilha<String> pilha1 = new Pilha();
        
        try {
            pilha1.desempilhar();
        } catch (PilhaVaziaException e) {
            // TRATAR A EXCEÇAO
            System.out.println("ERRO: " + e.getMessage());
        }
        
        System.out.println("!!!");
        
        
    }
}
