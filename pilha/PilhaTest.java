

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PilhaTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class PilhaTest
{
    /**
     * Construtor default para a classe de teste PilhaTest
     */
    public PilhaTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    // SEGUINDO O PARADIGMA DO BDD (BEHAVIOUR DRIVEN DESIGN)
    
    @Test
    public void quandoCriaPilhaVazia(){
        // QUANDO (PRE-CONDIÇAO) E FAÇA (EXECUÇAO DO COMPORTAMENTO):
        Pilha<String> pilha1 = new Pilha();
                
        // VERIFICAR (CHECK)
        assertTrue(pilha1.isVazia()); //true
    }
    
    @Test
    public void quandoEmpilhaNovoElemento(){
        // QUANDO:
        Pilha<String> pilha1 = new Pilha<String>();
        
        // FAÇA:
        pilha1.empilhar("arroz");
        
        // VERIFICAR
        assertEquals("arroz", pilha1.getTopo());
         
    }
    
    @Test
    public void quandoDesempilhaENaoVazio(){
        // QUANDO:
        Pilha<String> pilha1 = new Pilha<String>();
        pilha1.empilhar("arroz");
        
        // FAÇA:
        String topoAntigo = pilha1.desempilhar();
        
        // VERIFICAR:
        assertEquals("arroz", topoAntigo);
        assertNotEquals("arroz", pilha1.getTopo());
    }
    
    @Test
    public void quandoDesempilhaEVazio(){
        // QUANDO:
        Pilha<String> pilha1 = new Pilha<String>();
        
        // FAÇA:
        assertThrows(PilhaVaziaException.class, pilha1.desempilhar());
        
        // VERIFICAR:
        assertTrue(pilha1.isVazia());
    }
}
