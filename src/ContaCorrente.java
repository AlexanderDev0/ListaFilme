public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public void cobrarTafiraMensal(){
        saldo-=tarifaMensal;
        System.out.println("Tarifa mensal de "+ tarifaMensal + "cobrada saldo atual:" + saldo);
    }


}
