import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {
    private Queue<Cliente> fila;
    public FilaBanco() {
        fila = new LinkedList<>();
    }
    public void adicionarCliente(Cliente cliente) {
        fila.add(cliente);
        System.out.println(cliente.getNome() + " entrou na fila.");
    }
    public void atenderCliente() {
        Cliente atendido = fila.poll();
        if (atendido != null) {
            System.out.println("Atendendo:" + atendido);
        }
        else {
            System.out.println("Nenhum cliente na fila para atender");
        }
    }
    public void exibirFila(){
        if (fila.isEmpty()) {
            System.out.println("Fila vazia");
        }
        else {
            System.out.println("Clientes na fila:");
            for (Cliente cliente : fila) {
                System.out.println(cliente);
            }
        }
    }
}
