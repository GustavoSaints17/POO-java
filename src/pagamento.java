import java.util.Scanner;

class Funcionario {
    private String nome;
    private double salariobruto;

    Funcionario(String nome, double salariobruto) {
        this.nome = nome;
        setSalarioBruto(salariobruto);
    }

    public void setSalarioBruto(double salariobruto) {
        if (salariobruto > 0) {
            this.salariobruto = salariobruto;
        }

    }

    public double calcularINSS() {
        if (salariobruto >= 2000.0) {
            return salariobruto * 0.11;
        } else if (salariobruto >= 1500.0) {
            return salariobruto * 0.09;
        } else {
            return salariobruto * 0.08;
        }
    }

    public double calcularTransporte() {
        if (salariobruto >= 1000.0) {
            return salariobruto * 0.06;
        } else {
            return salariobruto * 0.05;
        }
    }

    public double salarioliquido() {
        return salariobruto - calcularINSS() - calcularTransporte();
    }

    public void exibirholerite() {
        System.out.println("--- Holerite do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: R$ " + salariobruto);
        System.out.println("Desconto INSS: R$ " + calcularINSS());
        System.out.println("Desconto Vale-Transporte: R$ " + calcularTransporte());
        System.out.println("Salário Líquido: R$ " + salarioliquido());
        System.out.println("--------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public double getSalariobruto() {
        return salariobruto;
    }


}



public class pagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalLiquidoEmpresa = 0.0;


        for (int i = 1; i <= 3; i++) {
            System.out.println("--- Digite os dados do " + i + "º Funcionário ---");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Salário Bruto: R$ ");
            double salarioBruto = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do teclado


            Funcionario func = new Funcionario(nome, salarioBruto);


            System.out.println();
            func.exibirholerite();


            totalLiquidoEmpresa += func.salarioliquido();
        }

        System.out.println("\n========================================");
        System.out.println("Total Líquido pago pela empresa: R$ " + totalLiquidoEmpresa);
        System.out.println("========================================");

        scanner.close();
    }
}