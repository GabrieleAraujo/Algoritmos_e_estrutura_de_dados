public class Cliente {
    private String nome;
    private int numeroConta;
    public Cliente(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }
    public String getNome() {
        return nome;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", numeroConta=" + numeroConta + '}';
    }
}
