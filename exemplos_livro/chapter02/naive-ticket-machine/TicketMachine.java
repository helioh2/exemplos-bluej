/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // ATRIBUTOS (CAMPOS)
    
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

        
    //CONSTRUTOR
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        this.price = cost;  // this.price --> variavel price deste objeto 
        this.balance = 0;
        this.total = 0;
    }

    // METODOS
    
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return this.price;  // RETORNA PARA QUEM CHAMOU O PREÇO DESTE OBJETO (OU: DO NOSSO OBJETO)
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return this.balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        //this.balance = this.balance + amount;
        this.balance += amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        
        if (this.balance >= this.price){
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
            
            // Update the total collected with the balance.
            this.total = this.total + this.price;
            // Clear the balance.
            this.balance = this.balance - this.price;  //sobrar o troco
        } else {
            System.out.println("Voce nao colocou a quantidade de dinheiro suficiente para o ticket. Faltam "+ (this.price - this.balance));
        }
        
        

        
    }
    
    
    
    /**
     * Retorna o troco baseado no que ha no balanço
     */
    public int getRefund(){  // ASSINATURA DO METODO
        int troco = this.balance;   // this.balance == 50 --> troco == ?? --> troco == 50 / this.balance == 50
        this.balance = 0;  // this.balance == 50 -> this.balance == 0
        return troco; // return 50
    }
}
