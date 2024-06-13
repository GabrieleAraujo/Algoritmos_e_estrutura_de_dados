/**
 * Exercício de Lista duplamente encadeada
 * Criado por Gabriele Araújo (GitHub:GabrieleAraujo)
 * Data: [11/06/2024]
 * Disciplina: ALGORITMOS E ESTRUTURAS DE DADOS
 */

public class Nodo {
    int dado;  // guardar o valor do nodo
    Nodo proximo;  // próximo nodo na lista

    // construtor que inicializa o campo dado e define proximo como null
    public Nodo(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}