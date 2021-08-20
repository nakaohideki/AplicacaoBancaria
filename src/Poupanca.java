public class Poupanca extends Conta //Conta Poupança é um tipo de conta, por isso herda todas as funcionalidades de conta.
{
    protected static int sequencia  =  50000; //Variável que especifica que a geração de conta poupança se iniciará a partir de 50000.
    public Poupanca(Cliente cliente) //Construtor que referencia os atributos de cliente na classe pai (conta) e outros atributos de conta.
    {
        super(cliente);
        this.agencia = agenciaPadrao;
        this.conta = sequencia++;
    }

    @Override
    public void imprimirSaldo() //Sobrescrita do método imprimir saldo da interface Operacoes implementada pela classe pai.
    {
        System.out.println("*** - Saldo de conta poupança - ***");     //Comportamento particular para as instâncias desta classe quando o
                                                                                                                                            //método imprimir dados é chamado.
        super.imprimirDados();  //Referencia o método imprimir dados da classe pai.
    }
}