/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int contEmprestimos;

    /**
     * Construtor
     */
    public Book(String bookAuthor, String bookTitle)
    {
        this.author = bookAuthor;
        this.title = bookTitle;
        
    }

    /**
     * Recuperar (pegar) o valor do atributo 'author'
     */
    public String getAuthor(){
        return this.author;
    }
    
    
    public void printAuthor(){
        System.out.println(this.author);
    }
    
    public void printDetails(){
        String detalhes = "Title: "+this.title + "BLABLABLA";
        detalhes = detalhes + "BLUBLU";
        
        if (this.refNumber.length() == 0){
            detalhes += "ZZZ";
        } else {
            detalhes += ...
        }
        
        System.out.print(detalhes);
        
        
    }
    
    public void setRefNumber(String ref){  //ref = "537" ... ref.length() --> 3
        if (ref.length() >= 3) {
            
        } else {
            System.out.print(...
        }
    }
    
    
    public void emprestar(){
        this.contEmprestimo++;  // Exemplo: this.contEmprestimo == 2  --> this.contEmprestimo == 3
    }
    
    getContEmprestimos()
    
}
