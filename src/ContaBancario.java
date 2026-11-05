class ContaBanco {
    private String titular;
    private int numero;
    private double saldo;


    ContaBanco(String titular, int numero, double depositoinicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = depositoinicial;
    }

    ContaBanco(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("valor invalido");
        }
    }

    boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }else{
            System.out.println("saldo insuficiente");
            return false;
        }

    }

    void exibirExtrato() {
        System.out.println("--- Extrato Bancario --- ");
        System.out.println("Titular: " + titular);
        System.out.println("Numero da Conta: " + numero);
        System.out.println("Saldo Atual: R$ " + saldo);
    }


    public String getTitular() {
        return titular;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

}

public class ContaBancario {
    public static void main(String[] args) {
        ContaBanco minhaConta = new ContaBanco("Gustavo", 1234, 500.0);

        minhaConta.depositar(200.0);

        boolean saque1 = minhaConta.sacar(1000.0);
        System.out.println("Tentativa de saque de R$ 1.000: " + (saque1 ? "Sucesso" : "Recusado"));

        boolean saque2 = minhaConta.sacar(300.0);
        System.out.println("Tentativa de saque de R$ 300: " + (saque2 ? "Sucesso" : "Recusado"));

        System.out.println();
        minhaConta.exibirExtrato();

    }
}
