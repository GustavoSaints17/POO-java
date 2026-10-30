public class privatee {
    public static void main(String[] args) {
        class Aluno {
            private String nome;
            public String getNome() {
                return this.nome;
            }
            public void setNome(String nome) {
                if (nome != null && !nome.isBlank()) {
                    this.nome = nome;
                }
            }
        }

    }}