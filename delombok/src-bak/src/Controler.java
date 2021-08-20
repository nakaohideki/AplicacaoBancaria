public class Controler
{
    public static void main(String[] args)
    {
        Cliente cliente = new Cliente ();
        Cliente cliente2 = new Cliente ();
        cliente.setNome("Hideki");
        cliente2.setNome("Mariana");
        Conta corrente = new Corrente(cliente);
        Conta corrente2 = new Corrente(cliente2);
        Conta poupanca = new Poupanca(cliente);
        corrente.depositar(1000);
        poupanca.depositar(1000);
        poupanca.transferir(1000, corrente);
        corrente.transferir(2000, poupanca);
        poupanca.transferir(2000, corrente2);
        //corrente2.sacar(5000);

        corrente.imprimirExtrato();
        corrente2.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
