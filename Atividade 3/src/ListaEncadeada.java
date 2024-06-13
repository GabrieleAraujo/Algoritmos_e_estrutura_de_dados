public class ListaEncadeada {
    private Nodo cabeca;  // Campo para apontar para o primeiro nodo da lista

    public ListaEncadeada() {
        this.cabeca = null;
    }

    // Implementar o Método adicionar
    public void adicionar(int dado) {
        Nodo novoNodo = new Nodo(dado);
        if (cabeca == null) {
            cabeca = novoNodo;  // Se a lista estiver vazia, criar um novo nodo e definir cabeca como este novo nodo
        } else {
            Nodo atual = cabeca;
            while (atual.getProximo() != null) {  // Percorrer a lista até encontrar o último nodo
                atual = atual.getProximo();
            }
            atual.setProximo(novoNodo);  // Adicionar o novo nodo ao final
        }
    }

    // Implementar o Método inserirApos
    public void inserirApos(int n1, int n2) {
        Nodo atual = cabeca;
        while (atual != null && atual.getDado() != n1) {  // Percorrer a lista para encontrar o nodo que contém o valor n1
            atual = atual.getProximo();
        }
        if (atual != null) {  // Se encontrar, criar um novo nodo com valor n2 e ajustá-lo para que seja inserido após o nodo com valor n1
            Nodo novoNodo = new Nodo(n2);
            novoNodo.setProximo(atual.getProximo());
            atual.setProximo(novoNodo);
        } else {
            System.out.println("Valor " + n1 + " não encontrado na lista.");  // Se não encontrar, exibir uma mensagem informando que o valor n1 não foi encontrado
        }
    }

    // Implementar o Método imprimirLista
    public void imprimirLista() {
        Nodo atual = cabeca;
        while (atual != null) {  // Percorrer a lista desde a cabeca, imprimindo o valor de cada nodo até o final da lista
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}