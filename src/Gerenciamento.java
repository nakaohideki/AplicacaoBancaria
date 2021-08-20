import java.util.HashSet;

public class Gerenciamento
{
    public static void main(String[] args)  //método principal
    {
        Cliente cliente = new Cliente ("Hideki");   //Criação do cliente Hideki
        Cliente cliente2 = new Cliente ("Mariana"); //Criação do cliente Mariana

        Conta corrente = new Corrente(cliente); //Criação de conta corrente.
        Conta corrente2 = new Corrente(cliente2); //Criação de conta corrente2.
        Conta poupanca = new Poupanca(cliente); //Criação de conta poupança.
        Conta poupanca2 = new Poupanca(cliente2); //Criação de conta poupança2.

        corrente.depositar(1000);   //Deposito em conta corrente no valor de R$ 1000,00.
        poupanca.depositar(1000);   //Deposito em conta poupança no valor de R$ 1000,00.

        poupanca.transferir(1000, corrente);    //transfencia de conta poupança para conta corrente de R$ 1000,00.
        corrente.transferir(2000, poupanca);    //transfencia de conta corrente para conta corrente de R$ 2000,00.
        poupanca.transferir(2000, corrente2);   //transfencia de conta poupança para conta corrente2 de R$ 2000,00.

        corrente2.sacar(5000);  //saque de conta corrente2 de R$ 5000,00.

        corrente.imprimirSaldo();   //imprimi o saldo de conta corrente.
        corrente2.imprimirSaldo();  //imprimi o saldo de conta corrente2.

        poupanca.imprimirSaldo();  //imprimi o saldo de conta poupança.
        poupanca2 .imprimirSaldo();  //imprimi o saldo de conta poupança2.

        HashSet<Conta> contas = new HashSet<>();    //Cria lista de contas existentes.
        contas.add(corrente);   //adiciona a conta corrente a lista criada.
        contas.add(corrente2);  //adiciona a conta corrente2 a lista criada.
        contas.add(poupanca);  //adiciona a conta poupança a lista criada.
        contas.add(poupanca2);  //adiciona a conta poupança2 a lista criada.

        System.out.println(contas); //imprime a lista de contas
    }
}