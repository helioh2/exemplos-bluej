
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void main(String[] args){
        Student student1;   // CRIANDO VARIAVEL ("ESPAÇO") PARA UM ALUNO
        student1 = new Student("Fulano", "12345"); // CRIANDO UM OBJETO ALUNO E ATRIBUINDO A VARIAVEL
        System.out.println(student1.getName());
        System.out.println(student1.getId());
        System.out.println(student1.getLoginName());
        System.out.println("Creditos anteriores do aluno: "+student1.getCredits());
        
        student1.addCredits(5); // CHAMADA DE METODO
        
        System.out.println("Creditos atuais do aluno: "+student1.getCredits());
        
        Student student2 = new Student("Beltrano", "54321");
        System.out.println(student2.getName());
        System.out.println(student2.getId());
        System.out.println(student2.getLoginName());
        
        
        LabClass labclass1 = new LabClass(2);
        labclass1.enrollStudent(student1);
        labclass1.enrollStudent(student2);
        labclass1.setInstructor("Luzia");
        labclass1.setTime("Segunda 15:00");
        labclass1.setRoom("A23");
        
        labclass1.printList();
        
        System.out.println("----------\n\n");
        
        LabClass labclass2 = new LabClass(5);
        labclass2.enrollStudent(student1);
        labclass2.setInstructor("Marcos");
        labclass2.setRoom("B12");
        labclass2.setTime("Terca 15:00");
        
        labclass2.printList();
        
        
               
        
        
        
        
        
        
        
        
        
        // String helloworld = "Ola Mundo";
        
        // System.out.println(helloworld);
        
        // String hello2 = helloworld.substring(0, 5);
        // String[] quebrados = helloworld.split(" ");
        
        // System.out.println(quebrados);  // ["Ola", "mundo"]
        
        // for (String pedaco: quebrados){
            // System.out.println(pedaco);
        // }
        
        // System.out.println(hello2);
        
    }
}
