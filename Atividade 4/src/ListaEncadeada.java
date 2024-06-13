import java.util.ArrayList;
import java.util.List;

public class ListaEncadeada {
    Nodo cabeca;

    // Método para adicionar um novo nodo ao final da lista
    public void adicionar(int dado) {
        Nodo novoNodo = new Nodo(dado);
        if (cabeca == null) {
            cabeca = novoNodo;
        } else {
            Nodo atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNodo;
        }
    }

    // Método para imprimir todos os nodos da lista
    public void imprimirLista() {
        Nodo atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Método para analisar a lista
    public void analisarLista(int valor) {
        Nodo atual = cabeca;
        int totalNodos = 0;
        int nodosIguais = 0;
        int nodosMaiores = 0;
        List<Integer> posicoesIguais = new ArrayList<>();

        int posicao = 0;
        while (atual != null) {
            totalNodos++;
            if (atual.dado == valor) {
                nodosIguais++;
                posicoesIguais.add(posicao);
            } else if (atual.dado > valor) {
                nodosMaiores++;
            }
            atual = atual.proximo;
            posicao++;
        }

        // Imprimir os resultados da análise
        System.out.println("Total de nodos: " + totalNodos);
        System.out.println("Nodos iguais ao valor " + valor + ": " + nodosIguais);
        if (!posicoesIguais.isEmpty()) {
            System.out.print("Posições dos nodos iguais: ");
            for (int p : posicoesIguais) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
        System.out.println("Nodos com valores maiores que " + valor + ": " + nodosMaiores);
    }
}
