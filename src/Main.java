public class Main {

    public static void main(String[] args) {
        Cliente nathalia = new Cliente();
        nathalia.setNome("nathalia");

        Conta cc = new ContaCorrente(nathalia);
        Conta cp = new ContaPoupanca(nathalia);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
