public abstract class Conta implements Operacoes
{
    private static  final int agenciaPadrao  = 1;
    private static  int sequencia  = 1;

    protected int agencia;
    protected int conta;
    protected double saldo = 0.0;
    protected Cliente cliente;

    public Conta(Cliente cliente)
    {
        this.agencia =agenciaPadrao;
        this.conta = sequencia++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor)
    {
        saldo -= valor;
    }

    public void depositar(double valor)
    {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino)
    {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia()
    {
        return agencia;
    }

    public int getConta()
    {
        return conta;
    }

    public double getSaldo()
    {
        return saldo<0 ? -saldo : saldo;
    }

    protected void imprimirDados()
    {
        System.out.println(String.format("Titular: %s",  this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format(saldo < 0 ? "Saldo: -R$ %.2f \n" : "Saldo: R$ %.2f \n", this.getSaldo()));
    }
}
