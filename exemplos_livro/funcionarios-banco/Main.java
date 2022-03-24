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
        Gerente gerente1 = new Gerente("Beltrano", "2727272232");
        Funcionario funcionario = gerente1;
        funcionario.setSalario(5000.0);
        
        //System.out.println(gerente.getSalario());
        
        Funcionario funcionario1 = new Gerente("Ciclano", "37373737");
        funcionario1.setSalario(8000.0);
        //System.out.println(funcionario1.getBonificacao());
        
        //Gerente ger1 = new Funcionario("Fulano", "2727272232");
        //ger1.getSenha();
        
        Funcionario funcionario2 = new Secretario("Fulano", "575675757");
        funcionario2.setSalario(3000);
        Funcionario funcionario3 = new Engenheiro("Mariazinha", "2312312312");
        funcionario3.setSalario(6000);
        
        Secretario secretario1 = new Secretario("Amanda", "23838438");
        secretario1.setSalario(4000);
        Engenheiro engenheiro1 = new Engenheiro("Lucia", "2888438585");
        engenheiro1.setSalario(10000);
        
        
        // CONTROLE DE BONIFICACOOES:
        ControleDeBonificacoes controleBonificacoes = new ControleDeBonificacoes();
        System.out.println(controleBonificacoes.getTotalBonificacoes());
        
        controleBonificacoes.registrar(funcionario2);
        System.out.println(controleBonificacoes.getTotalBonificacoes());
        
        controleBonificacoes.registrar(funcionario3);
        System.out.println(controleBonificacoes.getTotalBonificacoes());
        
        controleBonificacoes.registrar(gerente1);
        System.out.println(controleBonificacoes.getTotalBonificacoes());
        
        controleBonificacoes.registrar(funcionario1);
        System.out.println(controleBonificacoes.getTotalBonificacoes());
        
        // CONTROLE DE BONIFICACOOES com FOR:
        ControleDeBonificacoes controleBonificacoes2 = new ControleDeBonificacoes();
        List<Funcionario> todosFuncionarios = Arrays.asList(gerente1, 
                                            funcionario1, funcionario2, funcionario3,
                                            secretario1, engenheiro1);
                                            
        System.out.println(todosFuncionarios);
        
        for (Funcionario func: todosFuncionarios){
            controleBonificacoes2.registrar(func);
        }
        
        System.out.println(controleBonificacoes2.getTotalBonificacoes());
        
        
    }
}
