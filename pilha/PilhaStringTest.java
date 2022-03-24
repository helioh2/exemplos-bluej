

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PilhaStringTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class PilhaStringTest
{
    /**
     * Construtor default para a classe de teste PilhaStringTest
     */
    public PilhaStringTest()
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
    
    @Test
    public void testPilha() {
        
        PilhaString pilha1 = new PilhaString();
        assertTrue(pilha1.isVazia()); //true
        
        pilha1.empilhar("arroz");
        
        assertFalse(pilha1.isVazia());
        assertEquals("arroz", pilha1.getTopo()); // assertEquals(<resultado esperado>, <chamada>)
        
        pilha1.empilhar("feijao");
        
        assertEquals("feijao", pilha1.getTopo());
        
        // Pilha esta assim:
        // "feijao"  <-- TOPO
        // "arroz"
        
        pilha1.desempilhar();
        
        assertEquals("arroz", pilha1.getTopo());
        
        // Pilha esta assim:
        // "arroz" <-- TOPO
        
        
        PilhaString pilha2 = new PilhaString(); // PILHA VAZIA
        
        assertEquals("ERRO", pilha2.desempilhar());
        assertEquals("ERRO", pilha2.getTopo());
        
    }
    
    // SEGUINDO O PARADIGMA DO BDD (BEHAVIOUR DRIVEN DESIGN)
    
    @Test
    public void quandoCriaPilhaVazia(){
        // QUANDO (PRE-CONDIÇAO) E FAÇA (EXECUÇAO DO COMPORTAMENTO):
        PilhaString pilha1 = new PilhaString();
                
        // VERIFICAR (CHECK)
        assertTrue(pilha1.isVazia()); //true
    }
    
    @Test
    public void quandoEmpilhaNovoElemento(){
        // QUANDO:
        PilhaString pilha1 = new PilhaString();
        
        // FAÇA:
        pilha1.empilhar("arroz");
        
        // VERIFICAR
        assertEquals("arroz", pilha1.getTopo());
         
    }
    
    @Test
    public void quandoDesempilhaENaoVazio(){
        // QUANDO:
        PilhaString pilha1 = new PilhaString();
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
        PilhaString pilha1 = new PilhaString();
        
        // FAÇA:
        String topoAntigo = pilha1.desempilhar();
        
        // VERIFICAR:
        assertEquals("ERRO", topoAntigo);
        assertTrue(pilha1.isVazia());
    }
}
