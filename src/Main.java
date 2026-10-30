public class Main {
    public static void main(String[] args) {
        class Carro {
            String modelo;
            Carro(String modelo) {
                this.modelo = modelo;
            }
            void ligar() {
                System.out.println("Ligado!");
            }
        }

        Carro meuCarro = new Carro("Corolla");
        meuCarro.ligar();
        System.out.println(meuCarro.modelo);
    }
}
