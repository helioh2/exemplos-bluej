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
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int price)
    {
        if (price < 0) {
            this.price = 50;
        } else {
            this.price = price;
        }
        this.balance = 0;
        this.total = 0;
        
    }
    
    public TicketMachine() {
        //this(50)  //alternativa
        this.price = 50;
        this.balance = 0;
        this.total = 0;
    }
    

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        if (amount >= 0) {
            balance = balance + amount;
        } else {
            System.out.println("Valor inserido e invalido (deve ser maior que 0).");
        }
    }

    private int refund() {
        int troco = this.balance - this.price;
        this.balance = this.price;
        return troco;
        
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
    
            
            if (this.balance > this.price) {
                int troco = this.refund();
                System.out.println("Toma seu troco: "+troco);
            }
            
            // Update the total collected with the balance.
            this.total = this.total + this.balance;
            
            // Clear the balance.
            balance = 0;
        } else {
            System.out.println("Valor inserido ate o momento insuficiente.");
            this.prompt();
            this.showPrice();
        }
    }
    
    public void prompt(){
        System.out.println("Insira a quantidade correta de dinheiro");
     
    }
    
    public void showPrice(){
        System.out.println("O preço de um ticket eh "+this.price);
     
    }
    
    public int empty() {
        int aux = this.total;
        this.total = 0;
        return aux;
    }
    
    
    
    
}
