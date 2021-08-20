import lombok.Getter;   //Plugin  para simplificar a escrita dos códigos

public abstract class Conta implements Operacoes //Esta classe implementa a interface operações obrigando a ter seus métodos.
{
    protected static  final int agenciaPadrao  = 1; //variável imutável e vista por esta classe para agenciaPadrao.
    protected static  int sequencia  = 1;   //variável vista somente por esta classe para sequencia.
    @Getter
    protected int agencia;
    @Getter
    protected int conta;
    @Getter
    protected double saldo = 0.0;
    @Getter
    protected Cliente cliente;

    public Conta(Cliente cliente)   //construtor de conta
    {
        this.agencia =agenciaPadrao;
        this.conta = sequencia++;
        this.cliente = cliente;
    }

    @Override   //sobrescrita dos métodos da interface operacoes
    public void sacar(double valor)     //operação de saque
    {
        saldo -= valor; //é subtraido o valor do saque do saldo e atribuido a variável saldo.
    }
    public void depositar(double valor) //operação de deposito
    {
        saldo += valor; //é somado o valor de saque ao saldo e atribuido a variável saldo.
    }
    public void transferir(double valor, Conta contaDestino)    //operação de transferencia
    {
        this.sacar(valor);  //saca o valor da conta origem
        contaDestino.depositar(valor);  //deposita o valor na conta destino.
    }

    protected void imprimirDados()  //imprime os dados no saldo de cada tipo de conta.
    {
        System.out.printf("Titular: %s\nAgência: %04d\nConta: %05d\nSaldo: ", this.cliente.getNome(), this.getAgencia(), this.getConta());
        System.out.printf(this.getSaldo() < 0 ? "-R$ %.2f\n\n" : "R$ %.2f\n\n", this.getSaldo() < 0 ? -this.getSaldo() : this.getSaldo());
    }

    @Override
    public String toString()//sobrescreve o método padrao toString para editar o que será impresso quando for solicitado nesta classe.
    {
        return String.format("Titular: %-2s Agência %04d Conta: %05d Saldo: ", this.cliente.getNome(), this.getAgencia(), this.getConta()) +
                String.format(this.getSaldo()<0 ? "-R$ %.2f\n" : "R$ %.2f\n", this.getSaldo()<0 ? -this.getSaldo() : this.getSaldo());
    }
}