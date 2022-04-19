package br.ufpr.banco.conta;

public class LimiteUltrapassadoException extends RuntimeException {

    public LimiteUltrapassadoException(String message) {
        super(message);
    }

}
