package br.ufpr.banco;

public class TesteExcecoes {


    public static void metodoC(int x) throws RuntimeException {
        if (x < 0){
            throw new RuntimeException("OPA");
        }
        System.out.println("TUDO CERTO NO metodoC");
    }

    public static void metodoB(int x) throws RuntimeException {
        try {
            metodoC(x);
        } catch (RuntimeException e) {
            throw e;
        }
        
    }

    public static void metodoA(int x){
        try {
            metodoB(x);
        } catch (Exception e) {
            System.out.println("TRATANDO EXCEÇÃO: "+e.getMessage());
        } finally {
            // FECHAR ARQUIVO
            // FECHAR CONEXAO BANCO
            // conexao.close()
            System.out.println("FECHANDO CONEXÕES...");
        }
        
    }


    public static void main(String[] args) {
        metodoA(-20);
    }
    
}
