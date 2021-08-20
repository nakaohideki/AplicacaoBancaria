public class Corrente extends Conta //Conta Corrente é um tipo de conta, por isso herda todas as funcionalidades de conta.
{
    public Corrente(Cliente cliente)    //Construtor que referencia os atributos de cliente na classe pai (conta).
    {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() //Sobrescrita do método imprimir saldo da interface Operacoes implementada pela classe pai.
    {
        System.out.println("*** - Saldo de conta corrente - ***");     //Comportamento particular para as instâncias desta classe quando o
                                                                                                                                        //método imprimir dados é chamado.
        super.imprimirDados();  //Referencia o método imprimir dados da classe pai.
    }
}