import java.sql.SQLSyntaxErrorException;

class Carro {
     String modelo;
     String cor;
    boolean eletrico;// -> true para eletrico, false para manual
    int pneus = 4;
    Carro(String modelo, String cor, boolean eletrico) { // <- parametro, // MÉTODO CONSTRUCTOR - só acontece uma vez para criar um objeto.
        this.modelo = modelo; // ATRIBUTOS
        this.cor = cor;
        this.eletrico = eletrico;
        this.pneus = pneus; // -> ja tem um valor definido, nao precisa colocar no parametro
    }

    public String getModelo() { // METODO: GETTER
        return this.modelo;
    }

    public String getCor() { // METODO: GETTER
        return this.cor;
    }

    public int getPneus() { // METODO: GETTER
        return this.pneus;
    }

    public boolean getEletrico() { // METODO GETTER
        return this.eletrico;
    }

    public void setCor(String cor) { // METODO SETTER
        this.cor = cor;
    }


    void ligar() {
        System.out.println("Ligado!"); // METODO
    }

    void iniciarMotor(String marcha) {
        System.out.println("o carro saiu de " + marcha + " marcha");
    }
}
public class Main {
    public static void main(String[] args) {


        Carro meuCarro = new Carro("Corolla ",  "vermelho", true); // AQUI QUE NASCE O OBJETO

        meuCarro.ligar();
        meuCarro.iniciarMotor("1");
        System.out.println("modelo: " + meuCarro.getModelo() + " cor: " + meuCarro.cor + " eletrico ou manual: " + meuCarro.eletrico + " pneus: " + meuCarro.getPneus());

        meuCarro.setCor("amarelo");
        System.out.println(meuCarro.cor);

        meuCarro.ligar();
        System.out.println(meuCarro.getModelo());
    }
}
