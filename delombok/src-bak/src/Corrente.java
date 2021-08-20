public class Corrente extends Conta
{
    public Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato()
    {
        System.out.println("*** - Extrato da conta corrente - ***");
        super.imprimirDados();
    }
}
