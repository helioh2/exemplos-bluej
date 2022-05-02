
/**
 * Escreva uma descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pessoa
{
    protected String name;
    // the student ID
    protected String id;

    /**
     * Create a new student with a given name and ID number.
     */
    public Pessoa(String fullName, String studentID)
    {
        this.name = fullName;
        this.id = studentID;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Set a new name for this student.
     */
    public void setName(String replacementName)
    {
        this.name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getId()
    {
        return id;
    }
}
