public class ContaPoupança extends Conta {
    public ContaPoupança(Cliente cliente){
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("===Imprimir o Extrato Bancário da Poupança===");
        System.out.println("Tipo: Poupança");
        super.ImprimirInformações();
    }

}
