public class SistemaInterno {

    // public void login(Funcionario funcionario) {
    //     // invocar o método autentica?
    //     // não da! Nem todo Funcionario tem
    //     funcionario.autentica();
    // }


    public void login(Autenticavel cara) {
        // invocar o método autentica?
        // não da! Nem todo Funcionario tem
        cara.autentica();
    }
    
}
