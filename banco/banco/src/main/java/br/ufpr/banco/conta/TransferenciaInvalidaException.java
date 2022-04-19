package br.ufpr.banco.conta;

public class TransferenciaInvalidaException extends RuntimeException {

    public TransferenciaInvalidaException(String message) {
        super(message);
    }
    
}
