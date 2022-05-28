
public class main {

    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");
        Conta cc = new ContaCorrente(felipe);
        Conta poupanca = new ContaPoupanca(felipe);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
