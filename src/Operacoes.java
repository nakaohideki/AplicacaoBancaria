public interface Operacoes  //interface para aplicação nas contas onde listam todos os métodos a ser utilizados abstratamente.
{
    void sacar(double valor);   //método para operção de saque.
    void depositar(double valor);   //método para operação de depósito.
    void transferir(double valor, Conta contaDestino);  //método para operação de transferência.
    void imprimirSaldo();   //método para operação de impressão de saldo.
}