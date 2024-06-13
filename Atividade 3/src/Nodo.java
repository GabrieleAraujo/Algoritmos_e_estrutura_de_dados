/**
 * Exercício de Lista Encadeada
 * Criado por Gabriele Araújo (GitHub:GabrieleAraujo)
 * Data: [11/06/2024]
 * Disciplina: ALGORITMOS E ESTRUTURAS DE DADOS
 */


public class Nodo {
    private int dado;  // Campo para armazenar o valor do nodo
    private Nodo proximo;  // Campo para referenciar o próximo nodo na lista

    public Nodo(int dado) {  // Construtor que inicializa o campo dado e define proximo como null
        this.dado = dado;
        this.proximo = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}